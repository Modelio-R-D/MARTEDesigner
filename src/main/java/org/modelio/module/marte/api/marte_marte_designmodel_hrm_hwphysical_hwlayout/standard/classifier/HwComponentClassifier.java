/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.classifier.HwResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwComponent_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwComponentClassifier extends HwResourceClassifier {
    public static final String STEREOTYPE_NAME = "HwComponent_Classifier";

    public static final String HWCOMPONENT_CLASSIFIER_AREA_TAGTYPE = "HwComponent_Classifier_area";

    public static final String HWCOMPONENT_CLASSIFIER_DIMENSIONS_TAGTYPE = "HwComponent_Classifier_dimensions";

    public static final String HWCOMPONENT_CLASSIFIER_GRID_TAGTYPE = "HwComponent_Classifier_grid";

    public static final String HWCOMPONENT_CLASSIFIER_KIND_TAGTYPE = "HwComponent_Classifier_kind";

    public static final String HWCOMPONENT_CLASSIFIER_NBPINS_TAGTYPE = "HwComponent_Classifier_nbPins";

    public static final String HWCOMPONENT_CLASSIFIER_POSITION_TAGTYPE = "HwComponent_Classifier_position";

    public static final String HWCOMPONENT_CLASSIFIER_POWEREDSERVICES_TAGTYPE = "HwComponent_Classifier_poweredServices";

    public static final String HWCOMPONENT_CLASSIFIER_PRICE_TAGTYPE = "HwComponent_Classifier_price";

    public static final String HWCOMPONENT_CLASSIFIER_R_CONDITIONS_TAGTYPE = "HwComponent_Classifier_r_Conditions";

    public static final String HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION_TAGTYPE = "HwComponent_Classifier_staticConsumption";

    public static final String HWCOMPONENT_CLASSIFIER_STATICDISSIPATION_TAGTYPE = "HwComponent_Classifier_staticDissipation";

    public static final String HWCOMPONENT_CLASSIFIER_SUBCOMPONENTS_TAGTYPE = "HwComponent_Classifier_subComponents";

    public static final String HWCOMPONENT_CLASSIFIER_WEIGHT_TAGTYPE = "HwComponent_Classifier_weight";

    /**
     * Tells whether a {@link HwComponentClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwComponent_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwComponent_Classifier >> then instantiate a {@link HwComponentClassifier} proxy.
     * 
     * @return a {@link HwComponentClassifier} proxy on the created {@link Classifier}.
     */
    public static HwComponentClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentClassifier.STEREOTYPE_NAME);
        return HwComponentClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentClassifier} proxy from a {@link Classifier} stereotyped << HwComponent_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwComponentClassifier} proxy or <i>null</i>.
     */
    public static HwComponentClassifier instantiate(final Classifier obj) {
        return HwComponentClassifier.canInstantiate(obj) ? new HwComponentClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComponentClassifier} proxy from a {@link Classifier} stereotyped << HwComponent_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwComponentClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwComponentClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwComponentClassifier.canInstantiate(obj))
        	return new HwComponentClassifier(obj);
        else
        	throw new IllegalArgumentException("HwComponentClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwComponentClassifier other = (HwComponentClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Classifier_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Classifier_area() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Classifier_dimensions() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Classifier_grid() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Classifier_kind() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Classifier_nbPins() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Classifier_position() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Classifier_poweredServices() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Classifier_price() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Classifier_r_Conditions() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Classifier_staticConsumption() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Classifier_staticDissipation() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwComponent_Classifier_subComponents() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwComponent_Classifier_weight() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_WEIGHT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Classifier_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_area(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_kind(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_nbPins(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_position(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_price(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwComponent_Classifier_weight(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_WEIGHT_TAGTYPE_ELT, value);
    }

    protected HwComponentClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_KIND_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_DIMENSIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_AREA_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_POSITION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_GRID_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_NBPINS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_WEIGHT_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_PRICE_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_R_CONDITIONS_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_POWEREDSERVICES_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_STATICDISSIPATION_TAGTYPE_ELT;

        public static TagType HWCOMPONENT_CLASSIFIER_SUBCOMPONENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "76d55fe4-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55fe9-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_DIMENSIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55fe5-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_AREA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55fea-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_POSITION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55feb-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_GRID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55fe6-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_NBPINS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55fe7-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_WEIGHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55fe8-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_PRICE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55fec-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_R_CONDITIONS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55fed-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_POWEREDSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55fee-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55fef-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_STATICDISSIPATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55ff0-10b4-11df-81d9-0014222a9f79");
            HWCOMPONENT_CLASSIFIER_SUBCOMPONENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "76d55ff1-10b4-11df-81d9-0014222a9f79");
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
