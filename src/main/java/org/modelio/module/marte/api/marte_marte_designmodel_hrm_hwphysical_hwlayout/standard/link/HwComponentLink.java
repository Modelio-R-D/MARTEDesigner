/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class HwComponentLink extends HwResourceLink {
    public static final String STEREOTYPE_NAME = "HwComponent_Link";

    public static final String HWCOMPONENT_LINK_AREA_TAGTYPE = "HwComponent_Link_area";

    public static final String HWCOMPONENT_LINK_DIMENSIONS_TAGTYPE = "HwComponent_Link_dimensions";

    public static final String HWCOMPONENT_LINK_GRID_TAGTYPE = "HwComponent_Link_grid";

    public static final String HWCOMPONENT_LINK_KIND_TAGTYPE = "HwComponent_Link_kind";

    public static final String HWCOMPONENT_LINK_NBPINS_TAGTYPE = "HwComponent_Link_nbPins";

    public static final String HWCOMPONENT_LINK_POSITION_TAGTYPE = "HwComponent_Link_position";

    public static final String HWCOMPONENT_LINK_POWEREDSERVICES_TAGTYPE = "HwComponent_Link_poweredServices";

    public static final String HWCOMPONENT_LINK_PRICE_TAGTYPE = "HwComponent_Link_price";

    public static final String HWCOMPONENT_LINK_R_CONDITIONS_TAGTYPE = "HwComponent_Link_r_Conditions";

    public static final String HWCOMPONENT_LINK_STATICCONSUMPTION_TAGTYPE = "HwComponent_Link_staticConsumption";

    public static final String HWCOMPONENT_LINK_STATICDISSIPATION_TAGTYPE = "HwComponent_Link_staticDissipation";

    public static final String HWCOMPONENT_LINK_SUBCOMPONENTS_TAGTYPE = "HwComponent_Link_subComponents";

    public static final String HWCOMPONENT_LINK_WEIGHT_TAGTYPE = "HwComponent_Link_weight";

    /**
     * Tells whether a {@link HwComponentLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwComponent_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwComponent_Link >> then instantiate a {@link HwComponentLink} proxy.
     * 
     * @return a {@link HwComponentLink} proxy on the created {@link Link}.
     */
    public static HwComponentLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentLink.STEREOTYPE_NAME);
        return HwComponentLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentLink} proxy from a {@link Link} stereotyped << HwComponent_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwComponentLink} proxy or <i>null</i>.
     */
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
    public static HwComponentLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwComponentLink.canInstantiate(obj))
        	return new HwComponentLink(obj);
        else
        	throw new IllegalArgumentException("HwComponentLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Link_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Link_area() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Link_dimensions() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Link_grid() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Link_kind() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Link_nbPins() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Link_position() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Link_poweredServices() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Link_price() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Link_r_Conditions() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Link_staticConsumption() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Link_staticDissipation() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Link_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Link_subComponents() {
        return this.elt.getTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Link_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Link_weight() {
        return this.elt.getTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_WEIGHT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Link_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_area(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Link_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_kind(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Link_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_nbPins(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_position(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Link_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_price(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Link_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Link_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Link_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Link_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Link_weight(final String value) {
        this.elt.putTagValue(HwComponentLink.MdaTypes.HWCOMPONENT_LINK_WEIGHT_TAGTYPE_ELT, value);
    }

    protected HwComponentLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_KIND_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_DIMENSIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_AREA_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_POSITION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_GRID_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_NBPINS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_WEIGHT_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_PRICE_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_R_CONDITIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_POWEREDSERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_STATICCONSUMPTION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_STATICDISSIPATION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LINK_SUBCOMPONENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
