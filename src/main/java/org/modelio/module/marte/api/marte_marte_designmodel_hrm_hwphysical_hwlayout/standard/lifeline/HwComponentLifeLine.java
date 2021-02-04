/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.lifeline.HwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwComponent_LifeLine >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("01fd86ed-508c-4d93-b6da-40a3acfdf58e")
public class HwComponentLifeLine extends HwResourceLifeline {
    @objid ("28bf30c5-59d3-48ad-9e3a-46e44250dbd7")
    public static final String STEREOTYPE_NAME = "HwComponent_LifeLine";

    @objid ("1e8d57a6-c9bd-4ad9-b09e-6eb6a9fbe5b6")
    public static final String HWCOMPONENT_LIFELINE_AREA_TAGTYPE = "HwComponent_LifeLine_area";

    @objid ("f7d55de3-2021-4e0b-b4bb-2bce875b80a9")
    public static final String HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE = "HwComponent_LifeLine_dimensions";

    @objid ("f799fb83-0d42-45fc-8953-46b59a4d0984")
    public static final String HWCOMPONENT_LIFELINE_GRID_TAGTYPE = "HwComponent_LifeLine_grid";

    @objid ("d4f2399a-cb3a-4e04-ac4d-a57cd3d4d9f7")
    public static final String HWCOMPONENT_LIFELINE_KIND_TAGTYPE = "HwComponent_LifeLine_kind";

    @objid ("66e2543f-0c95-4c25-94c6-d8914b620655")
    public static final String HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE = "HwComponent_LifeLine_nbPins";

    @objid ("7bd63391-baec-45cd-9547-e23612bf811e")
    public static final String HWCOMPONENT_LIFELINE_POSITION_TAGTYPE = "HwComponent_LifeLine_position";

    @objid ("0cd64f2e-d66b-4d27-ae40-7842e8ff918e")
    public static final String HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE = "HwComponent_LifeLine_poweredServices";

    @objid ("15de57a9-55b5-4f97-be5e-e5ada85a7c5d")
    public static final String HWCOMPONENT_LIFELINE_PRICE_TAGTYPE = "HwComponent_LifeLine_price";

    @objid ("8819207d-40ee-4fbd-89e8-7319db859a88")
    public static final String HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE = "HwComponent_LifeLine_r_Conditions";

    @objid ("87b4cd0f-78da-4ce9-bebc-a1f12e3ef265")
    public static final String HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE = "HwComponent_LifeLine_staticConsumption";

    @objid ("61056b14-7051-4203-a444-6ae442ae86e6")
    public static final String HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE = "HwComponent_LifeLine_staticDissipation";

    @objid ("6020ee98-9f63-4784-94a3-1473acf5da2f")
    public static final String HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE = "HwComponent_LifeLine_subComponents";

    @objid ("b76f34ab-c02d-4baa-988d-309396f7e26c")
    public static final String HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE = "HwComponent_LifeLine_weight";

    /**
     * Tells whether a {@link HwComponentLifeLine proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwComponent_LifeLine >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1c6a726a-43c2-4807-96e1-fe8122e5042e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentLifeLine.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwComponent_LifeLine >> then instantiate a {@link HwComponentLifeLine} proxy.
     * 
     * @return a {@link HwComponentLifeLine} proxy on the created {@link Lifeline}.
     */
    @objid ("400bd67f-a493-4d7e-b2ce-a6a80890bf4f")
    public static HwComponentLifeLine create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentLifeLine.STEREOTYPE_NAME);
        return HwComponentLifeLine.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentLifeLine} proxy from a {@link Lifeline} stereotyped << HwComponent_LifeLine >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwComponentLifeLine} proxy or <i>null</i>.
     */
    @objid ("3f00f6f0-c7ac-48da-8ea7-a6436026d679")
    public static HwComponentLifeLine instantiate(final Lifeline obj) {
        return HwComponentLifeLine.canInstantiate(obj) ? new HwComponentLifeLine(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComponentLifeLine} proxy from a {@link Lifeline} stereotyped << HwComponent_LifeLine >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwComponentLifeLine} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("23c74abf-2b94-4b83-9e44-de1bea9bc43b")
    public static HwComponentLifeLine safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwComponentLifeLine.canInstantiate(obj))
        	return new HwComponentLifeLine(obj);
        else
        	throw new IllegalArgumentException("HwComponentLifeLine: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fd3eff5c-4d37-41e8-a0ae-33f26e106dd3")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HwComponentLifeLine other = (HwComponentLifeLine) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("6679fbfa-b93c-49fc-86da-767e159463f7")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca409fb4-d20c-4457-98e8-b954c7dfe9c9")
    public String getHwComponent_LifeLine_area() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("199a51a8-fbac-4e78-95e9-c3eda3f50b4e")
    public List<String> getHwComponent_LifeLine_dimensions() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3ee1b938-2ae6-4035-8ac7-bc5d173cbfcb")
    public List<String> getHwComponent_LifeLine_grid() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76593377-149c-4b55-a118-0e6de23e2ff1")
    public String getHwComponent_LifeLine_kind() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("74081947-ad6c-4483-b549-d7c193f510d7")
    public String getHwComponent_LifeLine_nbPins() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("228376dd-03e2-49f0-afea-94b325e3bbbd")
    public List<String> getHwComponent_LifeLine_position() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3c5375fb-b021-4491-bf5b-b45f7e48411a")
    public List<String> getHwComponent_LifeLine_poweredServices() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4f05ffb0-c7ca-40b1-b260-adb7a0a972ff")
    public String getHwComponent_LifeLine_price() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0c82aac4-8988-4c08-b588-bc3f60086893")
    public List<String> getHwComponent_LifeLine_r_Conditions() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aaf9ee36-af16-420e-9201-57680f7d697a")
    public String getHwComponent_LifeLine_staticConsumption() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b427c2a5-d813-42f9-8df1-8b4c989c0056")
    public String getHwComponent_LifeLine_staticDissipation() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a161fa97-b5f8-4c99-be63-d390b2e96dcc")
    public List<String> getHwComponent_LifeLine_subComponents() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70fed64e-43ff-43b3-9907-cc778871e203")
    public String getHwComponent_LifeLine_weight() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE_ELT);
    }

    @objid ("c01acce9-30ca-434e-8c1e-17f6c08dbd6a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("117a4da8-b70c-4146-bba2-5b6000e51e71")
    public void setHwComponent_LifeLine_area(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("507e12f0-0731-48af-a521-65334ac502b2")
    public void setHwComponent_LifeLine_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aaa04619-715f-497e-9615-22b13e949fc0")
    public void setHwComponent_LifeLine_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("002ef910-f6b7-4116-a39f-2f4c5d7924c2")
    public void setHwComponent_LifeLine_kind(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7e5416e-974b-40f2-9a5a-6f86371eb334")
    public void setHwComponent_LifeLine_nbPins(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b8a60f1-3cae-4ea2-87f5-13b9bcf714db")
    public void setHwComponent_LifeLine_position(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b09d25cb-0c6b-4147-855a-c0f4313e1d9c")
    public void setHwComponent_LifeLine_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90c79aad-ca28-4a6c-a8c2-d409be440368")
    public void setHwComponent_LifeLine_price(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c1a71f9-efa5-4d6a-8855-36edfd935f83")
    public void setHwComponent_LifeLine_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("32e75838-4d7d-4a50-b8ec-425d2fc7d584")
    public void setHwComponent_LifeLine_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d8cdc587-4ea6-4eb0-bcad-91b590aacb2f")
    public void setHwComponent_LifeLine_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d026407-b63e-489c-8e3a-f279da623e87")
    public void setHwComponent_LifeLine_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cb0f24dc-d361-494a-94b8-ea77d5837da3")
    public void setHwComponent_LifeLine_weight(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE_ELT, value);
    }

    @objid ("2fc12518-e828-4858-a7d7-97859d9a4fac")
    protected HwComponentLifeLine(final Lifeline elt) {
        super(elt);
    }

    @objid ("73e423b9-926a-4346-89f8-4bce8cbeb68a")
    public static final class MdaTypes {
        @objid ("a069f631-936c-454b-aa8d-7f535f8fb4e7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8282986d-aa78-493c-bae2-bb1d68f8f6cd")
        public static TagType HWCOMPONENT_LIFELINE_KIND_TAGTYPE_ELT;

        @objid ("697f10b6-1f0e-4706-bffe-8d59c1b039ed")
        public static TagType HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE_ELT;

        @objid ("2cbc44f9-f90b-4101-893b-3bfb57285c3a")
        public static TagType HWCOMPONENT_LIFELINE_AREA_TAGTYPE_ELT;

        @objid ("44429ba9-ffc0-4acf-8f39-d480d66ff425")
        public static TagType HWCOMPONENT_LIFELINE_POSITION_TAGTYPE_ELT;

        @objid ("716acac3-fb17-4f17-9e35-8e400527ff31")
        public static TagType HWCOMPONENT_LIFELINE_GRID_TAGTYPE_ELT;

        @objid ("eb6c3121-ff83-49bf-87a1-e02afb5ea8cf")
        public static TagType HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE_ELT;

        @objid ("d26d4342-37ca-4e92-8936-b6746383c9a1")
        public static TagType HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE_ELT;

        @objid ("8a5f2b4b-fb99-4dba-bd85-95e9ca5762f2")
        public static TagType HWCOMPONENT_LIFELINE_PRICE_TAGTYPE_ELT;

        @objid ("61de8107-751f-4ed5-bd0c-9b686613d754")
        public static TagType HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE_ELT;

        @objid ("aee6415a-233c-4864-8c2b-31396d9f9981")
        public static TagType HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE_ELT;

        @objid ("787024cc-53ea-44db-ad2c-59f791c8d428")
        public static TagType HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE_ELT;

        @objid ("2253ee6a-1759-4664-bb93-764f0517d228")
        public static TagType HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE_ELT;

        @objid ("4a57a1f7-4073-4443-8b3f-d5117bf9f329")
        public static TagType HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE_ELT;

        @objid ("c12a7392-cb7e-4c1c-84ac-fa214a9744ed")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ca9a4b5-689c-4fb8-8f3c-b0c20f0a5653")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("feec1441-5004-4df8-ade5-ef096bf8982d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "76bd8842-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8847-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8843-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_AREA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8848-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_POSITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8849-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_GRID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8844-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8845-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd8846-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_PRICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884a-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884b-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884c-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884d-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884e-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76bd884f-10b4-11df-81d9-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
