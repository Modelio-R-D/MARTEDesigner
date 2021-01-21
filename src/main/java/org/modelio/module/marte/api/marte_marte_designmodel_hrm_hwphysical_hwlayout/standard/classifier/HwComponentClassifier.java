/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.classifier;

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
@objid ("fdf119be-67f5-4560-977f-ce4c277ec6dc")
public class HwComponentClassifier extends HwResourceClassifier {
    @objid ("0c9ca81e-c0d6-4846-ba5f-70788910081a")
    public static final String STEREOTYPE_NAME = "HwComponent_Classifier";

    @objid ("494ab4ab-3c01-463d-9e7e-f54a20207ab9")
    public static final String HWCOMPONENT_CLASSIFIER_AREA_TAGTYPE = "HwComponent_Classifier_area";

    @objid ("cd789342-0451-4b3d-b3ee-346e4d4ad450")
    public static final String HWCOMPONENT_CLASSIFIER_DIMENSIONS_TAGTYPE = "HwComponent_Classifier_dimensions";

    @objid ("f0ede19f-79a5-4d82-80e4-b049b7c9ac3f")
    public static final String HWCOMPONENT_CLASSIFIER_GRID_TAGTYPE = "HwComponent_Classifier_grid";

    @objid ("b2097c27-0fa4-4b17-9e07-adb459d0bd58")
    public static final String HWCOMPONENT_CLASSIFIER_KIND_TAGTYPE = "HwComponent_Classifier_kind";

    @objid ("b9b512ba-84f8-409a-a764-3aa18c021599")
    public static final String HWCOMPONENT_CLASSIFIER_NBPINS_TAGTYPE = "HwComponent_Classifier_nbPins";

    @objid ("86578fda-55f1-4a36-8a9d-d372829fe5d2")
    public static final String HWCOMPONENT_CLASSIFIER_POSITION_TAGTYPE = "HwComponent_Classifier_position";

    @objid ("c776fd89-7838-4574-ae3d-a0b730d5891e")
    public static final String HWCOMPONENT_CLASSIFIER_POWEREDSERVICES_TAGTYPE = "HwComponent_Classifier_poweredServices";

    @objid ("44442b57-31cd-47de-b870-29f3e6dbfd9c")
    public static final String HWCOMPONENT_CLASSIFIER_PRICE_TAGTYPE = "HwComponent_Classifier_price";

    @objid ("13547c74-c64d-4632-9f95-a2059bf4b26f")
    public static final String HWCOMPONENT_CLASSIFIER_R_CONDITIONS_TAGTYPE = "HwComponent_Classifier_r_Conditions";

    @objid ("a964276b-90e4-4e6e-afd6-0715a2126f7a")
    public static final String HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION_TAGTYPE = "HwComponent_Classifier_staticConsumption";

    @objid ("b419ae65-7f6d-47ec-8f6f-7b50124364a5")
    public static final String HWCOMPONENT_CLASSIFIER_STATICDISSIPATION_TAGTYPE = "HwComponent_Classifier_staticDissipation";

    @objid ("48bf7446-dffd-4e63-86f2-7362a4e534e8")
    public static final String HWCOMPONENT_CLASSIFIER_SUBCOMPONENTS_TAGTYPE = "HwComponent_Classifier_subComponents";

    @objid ("3d02b52b-0478-4dc1-89ae-54629d148c4b")
    public static final String HWCOMPONENT_CLASSIFIER_WEIGHT_TAGTYPE = "HwComponent_Classifier_weight";

    /**
     * Tells whether a {@link HwComponentClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwComponent_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9b132b36-e64d-4eeb-9d66-06207cfa192c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwComponent_Classifier >> then instantiate a {@link HwComponentClassifier} proxy.
     * 
     * @return a {@link HwComponentClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("129c4030-26b2-4ba3-a614-4b16f2573c2e")
    public static HwComponentClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComponentClassifier.STEREOTYPE_NAME);
        return HwComponentClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwComponentClassifier} proxy from a {@link Classifier} stereotyped << HwComponent_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwComponentClassifier} proxy or <i>null</i>.
     */
    @objid ("886b77e2-de56-4b5f-9e5e-dc0b08d2f680")
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
    @objid ("a9bcd5d7-75f8-4035-ab4e-e845d174cbfd")
    public static HwComponentClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwComponentClassifier.canInstantiate(obj))
        	return new HwComponentClassifier(obj);
        else
        	throw new IllegalArgumentException("HwComponentClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3b5337c6-75ea-4a25-a1f6-553a287fd1a8")
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
    @objid ("89d5abeb-420d-4955-98b6-9389aae12502")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwComponent_Classifier_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a21645a7-e8ae-47d5-bdb3-05d9e79633ee")
    public String getHwComponent_Classifier_area() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_AREA_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_dimensions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4d45799a-b49e-4411-b831-8aa64c5e5a0d")
    public List<String> getHwComponent_Classifier_dimensions() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_DIMENSIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_grid'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a720a331-c498-4b8c-b303-664b2c54e05a")
    public List<String> getHwComponent_Classifier_grid() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_GRID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a41a22d5-8a11-4d28-95ac-063eaba4db60")
    public String getHwComponent_Classifier_kind() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e0cf31a0-46f0-473f-bf7b-ef41e53404ba")
    public String getHwComponent_Classifier_nbPins() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_NBPINS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_position'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7e1c7cb0-5a40-43b0-a71d-a4231a98264c")
    public List<String> getHwComponent_Classifier_position() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_POSITION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_poweredServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("15a7038d-91a6-4deb-99ec-71a987c56358")
    public List<String> getHwComponent_Classifier_poweredServices() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_POWEREDSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6713d2b5-136d-47e0-9415-a88e08945027")
    public String getHwComponent_Classifier_price() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_PRICE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_r_Conditions'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("213de4b9-a223-4f2c-8967-15be104ab9c5")
    public List<String> getHwComponent_Classifier_r_Conditions() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_R_CONDITIONS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bde7bc85-409b-441a-9867-2da0f8424b84")
    public String getHwComponent_Classifier_staticConsumption() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70eb9fb0-f181-44d4-9b22-69f5a71f963f")
    public String getHwComponent_Classifier_staticDissipation() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_STATICDISSIPATION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComponent_Classifier_subComponents'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5134fda4-14a7-4dfd-9d48-9e47e1ca1dc0")
    public List<String> getHwComponent_Classifier_subComponents() {
        return this.elt.getTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_SUBCOMPONENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComponent_Classifier_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("818cd1ca-0aba-4d68-8449-cdd3dd6c8afb")
    public String getHwComponent_Classifier_weight() {
        return this.elt.getTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_WEIGHT_TAGTYPE_ELT);
    }

    @objid ("5861ff04-6138-4707-aa42-91aa05f96a18")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComponent_Classifier_area'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("08b45074-57e5-48ad-b475-66982e2447cd")
    public void setHwComponent_Classifier_area(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_AREA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_dimensions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1e327c40-5b26-42c8-8c21-1d4ebf076acb")
    public void setHwComponent_Classifier_dimensions(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_DIMENSIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_grid'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a122fbd-e819-4372-b86c-c284ad6b47d4")
    public void setHwComponent_Classifier_grid(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_GRID_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28e5bd10-2eb5-476c-aec9-f4053d33f271")
    public void setHwComponent_Classifier_kind(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_nbPins'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("029a4dae-a88e-4cd9-8783-9a705592d0ab")
    public void setHwComponent_Classifier_nbPins(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_NBPINS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_position'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("44274470-30b3-43f6-b132-eadd229c2880")
    public void setHwComponent_Classifier_position(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_POSITION_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_poweredServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5fe8ba5f-b566-42c2-b137-817c28a2df53")
    public void setHwComponent_Classifier_poweredServices(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_POWEREDSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_price'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c5d4564-6684-4b79-83b2-b5617ee61b07")
    public void setHwComponent_Classifier_price(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_PRICE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_r_Conditions'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4fbc7572-3a37-47ba-b8fd-69baf35dfbc6")
    public void setHwComponent_Classifier_r_Conditions(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_R_CONDITIONS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_staticConsumption'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b9ca9cc7-fa54-4d9e-ac14-6ec88fb7e202")
    public void setHwComponent_Classifier_staticConsumption(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_staticDissipation'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5e517ce-f344-436b-b006-4173eb32c550")
    public void setHwComponent_Classifier_staticDissipation(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_STATICDISSIPATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComponent_Classifier_subComponents'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("178b849f-6d33-4f34-9626-d13d2f9bf292")
    public void setHwComponent_Classifier_subComponents(final List<String> values) {
        this.elt.putTagValues(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_SUBCOMPONENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComponent_Classifier_weight'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("38940010-f666-4463-b3b5-c088b24d68c2")
    public void setHwComponent_Classifier_weight(final String value) {
        this.elt.putTagValue(HwComponentClassifier.MdaTypes.HWCOMPONENT_CLASSIFIER_WEIGHT_TAGTYPE_ELT, value);
    }

    @objid ("020e9043-1e91-4aea-b81f-59e93d1da5c1")
    protected HwComponentClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("caab5610-0560-4077-a6ee-298efd11d618")
    public static final class MdaTypes {
        @objid ("a1d3ed43-efad-41e6-a1bd-3ca08a24af1c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("491af009-ae1a-405c-b315-cc8105075071")
        public static TagType HWCOMPONENT_CLASSIFIER_KIND_TAGTYPE_ELT;

        @objid ("9faa17c4-83c6-4990-a10a-fd2ff53d1e5f")
        public static TagType HWCOMPONENT_CLASSIFIER_DIMENSIONS_TAGTYPE_ELT;

        @objid ("7a424122-6d59-44d9-8205-f082128d615d")
        public static TagType HWCOMPONENT_CLASSIFIER_AREA_TAGTYPE_ELT;

        @objid ("e5bcc775-ee11-4017-a3d0-2b6191b92ce7")
        public static TagType HWCOMPONENT_CLASSIFIER_POSITION_TAGTYPE_ELT;

        @objid ("916189b6-f3ba-4067-b75d-b74bcf0a36ae")
        public static TagType HWCOMPONENT_CLASSIFIER_GRID_TAGTYPE_ELT;

        @objid ("b034829a-8e70-4f6d-aa0c-186bb6ef6146")
        public static TagType HWCOMPONENT_CLASSIFIER_NBPINS_TAGTYPE_ELT;

        @objid ("f7948d34-f7ce-4aee-a776-66a69a872465")
        public static TagType HWCOMPONENT_CLASSIFIER_WEIGHT_TAGTYPE_ELT;

        @objid ("2d4af2d4-fc45-4372-9b62-ebd17027b6d7")
        public static TagType HWCOMPONENT_CLASSIFIER_PRICE_TAGTYPE_ELT;

        @objid ("ec0c94e1-1b4b-4991-a10d-bff517ff7d02")
        public static TagType HWCOMPONENT_CLASSIFIER_R_CONDITIONS_TAGTYPE_ELT;

        @objid ("b868dcea-9411-4c36-9263-bf6ab5ae4db9")
        public static TagType HWCOMPONENT_CLASSIFIER_POWEREDSERVICES_TAGTYPE_ELT;

        @objid ("f1e55178-8965-4485-be7e-63b179861398")
        public static TagType HWCOMPONENT_CLASSIFIER_STATICCONSUMPTION_TAGTYPE_ELT;

        @objid ("10e2da07-a2ba-4882-ba8d-1291d87b1841")
        public static TagType HWCOMPONENT_CLASSIFIER_STATICDISSIPATION_TAGTYPE_ELT;

        @objid ("7b6e5e7e-4f93-43b1-806c-83fd74c96e76")
        public static TagType HWCOMPONENT_CLASSIFIER_SUBCOMPONENTS_TAGTYPE_ELT;

        @objid ("2bbced2a-aa95-4be5-a6da-431337973b37")
        private static Stereotype MDAASSOCDEP;

        @objid ("d5eb3283-019f-404d-aae7-d8ebd62d1ac9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("01d1fdea-cef0-45a3-b724-2d29fee246ad")
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
