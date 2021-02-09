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
public class HwComponentLifeLine extends HwResourceLifeline {
    public static final String STEREOTYPE_NAME = "HwComponent_LifeLine";

    public static final String HWCOMPONENT_LIFELINE_AREA_TAGTYPE = "HwComponent_LifeLine_area";

    public static final String HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE = "HwComponent_LifeLine_dimensions";

    public static final String HWCOMPONENT_LIFELINE_GRID_TAGTYPE = "HwComponent_LifeLine_grid";

    public static final String HWCOMPONENT_LIFELINE_KIND_TAGTYPE = "HwComponent_LifeLine_kind";

    public static final String HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE = "HwComponent_LifeLine_nbPins";

    public static final String HWCOMPONENT_LIFELINE_POSITION_TAGTYPE = "HwComponent_LifeLine_position";

    public static final String HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE = "HwComponent_LifeLine_poweredServices";

    public static final String HWCOMPONENT_LIFELINE_PRICE_TAGTYPE = "HwComponent_LifeLine_price";

    public static final String HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE = "HwComponent_LifeLine_r_Conditions";

    public static final String HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE = "HwComponent_LifeLine_staticConsumption";

    public static final String HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE = "HwComponent_LifeLine_staticDissipation";

    public static final String HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE = "HwComponent_LifeLine_subComponents";

    public static final String HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE = "HwComponent_LifeLine_weight";

    /**
     * Tells whether a {@link HwComponentLifeLine proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwComponent_LifeLine >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentLifeLine.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwComponent_LifeLine >> then instantiate a {@link HwComponentLifeLine} proxy.
     * 
     * @return a {@link HwComponentLifeLine} proxy on the created {@link Lifeline}.
     */
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
    public static HwComponentLifeLine safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwComponentLifeLine.canInstantiate(obj))
        	return new HwComponentLifeLine(obj);
        else
        	throw new IllegalArgumentException("HwComponentLifeLine: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwComponentLifeLine other = (HwComponentLifeLine) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_LifeLine_area() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_LifeLine_dimensions() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_LifeLine_grid() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_LifeLine_kind() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_LifeLine_nbPins() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_LifeLine_position() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_LifeLine_poweredServices() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_LifeLine_price() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_LifeLine_r_Conditions() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_LifeLine_staticConsumption() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_LifeLine_staticDissipation() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_LifeLine_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_LifeLine_subComponents() {
        return this.elt.getTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_LifeLine_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_LifeLine_weight() {
        return this.elt.getTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_area(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_kind(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_nbPins(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_position(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_price(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_LifeLine_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_LifeLine_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_LifeLine_weight(final String value) {
        this.elt.putTagValue(HwComponentLifeLine.MdaTypes.HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE_ELT, value);
    }

    protected HwComponentLifeLine(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_KIND_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_DIMENSIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_AREA_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_POSITION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_GRID_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_NBPINS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_WEIGHT_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_PRICE_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_R_CONDITIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_POWEREDSERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_STATICCONSUMPTION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_STATICDISSIPATION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_LIFELINE_SUBCOMPONENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
