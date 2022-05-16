// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart LegL;
	private final ModelPart LegR;
	private final ModelPart Backpack;
	private final ModelPart Head;
	private final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.LegL = root.getChild("LegL");
		this.LegR = root.getChild("LegR");
		this.Backpack = root.getChild("Backpack");
		this.Head = root.getChild("Head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LegL = partdefinition.addOrReplaceChild("LegL",
				CubeListBuilder.create().texOffs(60, 49)
						.addBox(-3.0F, 0.0F, -3.0F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(86, 53)
						.addBox(-3.0F, 9.0F, -5.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 12.0F, 0.0F));

		PartDefinition LegR = partdefinition.addOrReplaceChild("LegR",
				CubeListBuilder.create().texOffs(86, 42)
						.addBox(-4.0F, 9.0F, -5.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(60, 34)
						.addBox(-4.0F, 0.0F, -3.0F, 7.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 12.0F, 0.0F));

		PartDefinition Backpack = partdefinition.addOrReplaceChild("Backpack", CubeListBuilder.create().texOffs(80, 9)
				.addBox(-5.0F, -33.0F, 6.0F, 10.0F, 18.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(20, 8)
				.addBox(-7.0F, -3.0F, -2.0F, 14.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, -6.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 30)
				.addBox(-9.0F, -34.0F, -6.0F, 18.0F, 22.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LegL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LegR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Backpack.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LegR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LegL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}