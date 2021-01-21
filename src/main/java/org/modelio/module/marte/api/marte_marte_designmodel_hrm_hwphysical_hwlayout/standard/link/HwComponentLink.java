/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.link.HwResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwComponent_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5e4cad8b-1ebd-46a3-8de4-a089c8580d2d")
public class HwComponentLink extends HwResourceLink {
    @objid ("68f08868-57bc-47f1-b383-1039374eecb6")
    public static final String STEREOTYPE_NAME = "HwComponent_Link";

    @objid ("ace10a94-b2da-4a41-aa34-cdcfe997aa68")
    public static final String HWCOMPONENT_LINK_AREA_TAGTYPE = "HwComponent_Link_area";

    @objid ("2be72cd4-3c5e-4f77-a027-702ddf5a036f")
    public static final String HWCOMPONENT_LINK_DIMENSIONS_TAGTYPE = "HwComponent_Link_dimensions";

    @objid ("65dc4157-b2e9-46bb-a3ff-454962c562ee")
    public static final String HWCOMPONENT_LINK_GRID_TAGTYPE = "HwComponent_Link_grid";

    @objid ("0444ad7f-ffd2-4863-893c-84f6932c76e4")
    public static final String HWCOMPONENT_LINK_KIND_TAGTYPE = "HwComponent_Link_kind";

    @objid ("1147ca0a-2c47-4a36-8a03-04c73a228b3f")
    public static final String HWCOMPONENT_LINK_NBPINS_TAGTYPE = "HwComponent_Link_nbPins";

    @objid ("b9dbdd6b-ca31-42ec-9a90-b997102e6c14")
    public static final String HWCOMPONENT_LINK_POSITION_TAGTYPE = "HwComponent_Link_position";

    @objid ("6ef40e8d-c2c3-4f1b-9fb8-beee623ec659")
    public static final String HWCOMPONENT_LINK_POWEREDSERVICES_TAGTYPE = "HwComponent_Link_poweredServices";

    @objid ("9ba6124b-5208-498c-9365-c9da48a07210")
    public static final String HWCOMPONENT_LINK_PRICE_TAGTYPE = "HwComponent_Link_price";

    @objid ("798becd1-5566-4cb8-a72f-caa07d4c60b4")
    public static final String HWCOMPONENT_LINK_R_CONDITIONS_TAGTYPE = "HwComponent_Link_r_Conditions";

    @objid ("298011b2-06f3-42a7-ba71-6b226192ba24")
    public static final String HWCOMPONENT_LINK_STATICCONSUMPTION_TAGTYPE = "HwComponent_Link_staticConsumption";

    @objid ("22b07e61-35ce-4a2d-9151-2eb93799bbf7")
    public static final String HWCOMPONENT_LINK_STATICDISSIPATION_TAGTYPE = "HwComponent_Link_staticDissipation";

    @objid ("4d468aa1-7163-4275-869e-e15be2ccbc12")
    public static final String HWCOMPONENT_LINK_SUBCOMPONENTS_TAGTYPE = "HwComponent_Link_subComponents";

    @objid ("10ea649a-3516-4055-8612-a764c1a75702")
    public static final String HWCOMPONENT_LINK_WEIGHT_TAGTYPE = "HwComponent_Link_weight";

    /**
     * Tells whether a {@link HwComponentLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwComponent_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1c840c4a-54d3-486a-8769-34e9e2511e03")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwComponent_Link >> then instantiate a {@link HwComponentLink} proxy.
     * 
     * @return a {@link HwComponentLink} proxy on the created {@link Link}.
     */
    @objid ("3ded416d-9e85-4f65-aa6a-0b20a540c3ce")
    public static HwComponentLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentLink.STEREOTYPE_NAME);
        return HwComponentLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentLink} proxy from a {@link Link} stereotyped << HwComponent_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwComponentLink} proxy or <i>null</i>.
     */
    @objid ("27851686-64fd-404c-bc6f-447c740f8878")
    public static HwComponentLink instantiate(final Link obj) {
        return HwComponentLink.canInstantiate(obj) ? new HwComponentLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComponentLink} proxy from a {@link Link} stereotyped << HwComponent_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwComponentLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5f73b264-282e-413f-b28b-e55c6ce14238")
    public static HwComponentLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwComponentLink.canInstantiate(obj))
        	return new HwComponentLink(obj);
        else
        	throw new IllegalArgumentException("HwComponentLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8b704122-d416-46fb-9395-f8e923416427")
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
        HwComponentLink other = (HwComponentLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("444cc74b-1e25-406b-a063-c9d13ea98186")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Link_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c8e0588f-9ac9-45ec-96f1-bb0a851de7a6")
    public String getHwComponent_Link_area() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d4f17159-1d99-47ac-9950-c0223f3b8d15")
    public List<String> getHwComponent_Link_dimensions() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("86f49c51-7027-44df-8448-58cb3c0cbc60")
    public List<String> getHwComponent_Link_grid() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("36ed4259-bc72-4fa9-9a73-49cfb03c52ce")
    public String getHwComponent_Link_kind() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f08ec90c-1c84-4d09-b9f6-1fda906cc378")
    public String getHwComponent_Link_nbPins() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("329431d4-ce24-4766-b4e7-e1cb7e174c6d")
    public List<String> getHwComponent_Link_position() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c37d22dc-5b58-42a1-88bc-28684e1ddc27")
    public List<String> getHwComponent_Link_poweredServices() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("79a6cbc7-45a7-4c04-a3c6-7604b33af893")
    public String getHwComponent_Link_price() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e843fb98-1fbe-4e1f-8a5b-6352467a7b7f")
    public List<String> getHwComponent_Link_r_Conditions() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0054c31d-0e76-4d3e-8828-8a1222b903cc")
    public String getHwComponent_Link_staticConsumption() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0dd373a3-fddd-4512-a622-8d7e7b5aa70b")
    public String getHwComponent_Link_staticDissipation() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5a5c9d07-83a9-47f1-948b-0b523e8b8e36")
    public List<String> getHwComponent_Link_subComponents() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bdaf7396-83f6-4833-8535-1234412fe289")
    public String getHwComponent_Link_weight() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_WEIGHT_TAGTYPE_ELT);
    }

    @objid ("24dcb229-067d-45c5-9d40-c95d071899f8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Link_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8bf1934e-3164-4fd5-b11c-2c2eb43cf564")
    public void setHwComponent_Link_area(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5814256d-acad-43b1-932c-57853adea6a1")
    public void setHwComponent_Link_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f7da7a82-db1e-415b-805d-8be25a1f07c4")
    public void setHwComponent_Link_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Link_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4d8d07c8-df7b-4e78-bb85-0508d6ed3d89")
    public void setHwComponent_Link_kind(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Link_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("046c3f30-2251-4e70-a14c-eba1b51ea55e")
    public void setHwComponent_Link_nbPins(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("20eff4ef-cdb6-4f33-80ea-0b05a279a864")
    public void setHwComponent_Link_position(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7bda8d16-6e5e-467b-b74a-44b6f792edc1")
    public void setHwComponent_Link_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Link_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b17bae3b-17d1-422a-9a59-091013438f95")
    public void setHwComponent_Link_price(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2157ecf-f5af-4ca8-8ded-807a0a6967c5")
    public void setHwComponent_Link_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Link_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("034642bb-fb74-430e-8e1a-3e30bda625a9")
    public void setHwComponent_Link_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Link_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce846750-e1ea-4988-9f98-d53eadafa05e")
    public void setHwComponent_Link_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8b9461f-c8cf-4246-98f0-6fcef3cef8d9")
    public void setHwComponent_Link_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Link_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dbd785b2-c3c0-421c-8719-1f668777a5e4")
    public void setHwComponent_Link_weight(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_WEIGHT_TAGTYPE_ELT, value);
    }

    @objid ("afd3cc00-e9a9-4135-b6e5-95afc19fad1d")
    protected HwComponentLink(final Link elt) {
        super(elt);
    }

    @objid ("ee48f1b4-ab4d-46dd-a194-b7629f166f09")
    public static final class MdaTypes {
        @objid ("409f1546-a012-428d-9561-8c7f3be08405")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3fd50022-3f47-45cb-83ce-830ae1972a64")
        public static TagType HWCOMPONENT_LINK_KIND_TAGTYPE_ELT;

        @objid ("087d78d5-7285-4251-ae5e-f84734cc9404")
        public static TagType HWCOMPONENT_LINK_DIMENSIONS_TAGTYPE_ELT;

        @objid ("bc1e0c9c-5cd4-4d71-9272-d5e63ab857c6")
        public static TagType HWCOMPONENT_LINK_AREA_TAGTYPE_ELT;

        @objid ("bc3e7c1a-8f4b-420f-87e9-617802cf275f")
        public static TagType HWCOMPONENT_LINK_POSITION_TAGTYPE_ELT;

        @objid ("551743b9-5a45-449c-bddb-db7591b7f5e4")
        public static TagType HWCOMPONENT_LINK_GRID_TAGTYPE_ELT;

        @objid ("ffb20662-d69f-4235-93ca-67bbe039b1a3")
        public static TagType HWCOMPONENT_LINK_NBPINS_TAGTYPE_ELT;

        @objid ("24cc98dd-215e-438c-b502-6da6c8aaa968")
        public static TagType HWCOMPONENT_LINK_WEIGHT_TAGTYPE_ELT;

        @objid ("3812d38f-2703-4287-8820-8264670799ae")
        public static TagType HWCOMPONENT_LINK_PRICE_TAGTYPE_ELT;

        @objid ("d336dd40-cdc5-4dac-a2e0-de12028f2353")
        public static TagType HWCOMPONENT_LINK_R_CONDITIONS_TAGTYPE_ELT;

        @objid ("da3b8e41-5997-496b-86e4-e89de64180ea")
        public static TagType HWCOMPONENT_LINK_POWEREDSERVICES_TAGTYPE_ELT;

        @objid ("3305b55e-cb82-45d0-a796-daa19ff229bc")
        public static TagType HWCOMPONENT_LINK_STATICCONSUMPTION_TAGTYPE_ELT;

        @objid ("79f98e63-968c-49f5-985d-72a9f60e5178")
        public static TagType HWCOMPONENT_LINK_STATICDISSIPATION_TAGTYPE_ELT;

        @objid ("b1e24ad9-e7c7-4537-ba5a-d3381b0c2aa8")
        public static TagType HWCOMPONENT_LINK_SUBCOMPONENTS_TAGTYPE_ELT;

        @objid ("3cf484a5-c4f6-4579-b385-0f7afe0df8b6")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e9940e3-8ba1-4b35-9f0e-a29c55cc3755")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c3fc257f-46a9-447c-8406-a982cdf0314e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0188ecda-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188ece1-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_DIMENSIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0188ece8-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_AREA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f2a-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_POSITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f31-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_GRID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f38-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_NBPINS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f3f-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_WEIGHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f46-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_PRICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f4d-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_R_CONDITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018b4f54-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_POWEREDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db17d-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_STATICCONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db184-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_STATICDISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db18b-0ccf-11df-8525-001302895b2b");
            HWCOMPONENT_LINK_SUBCOMPONENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "018db192-0ccf-11df-8525-001302895b2b");
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
