/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwmemory.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwROM_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4bcfb7cd-9bd3-4d0b-9ae1-a77c018baefc")
public class HwROMClassifier extends HwMemoryClassifier {
    @objid ("9913ecd2-688e-43d1-a49d-ed7485460357")
    public static final String STEREOTYPE_NAME = "HwROM_Classifier";

    @objid ("cf8f3b3e-1c99-4db5-a32e-810f98423a8d")
    public static final String HWROM_CLASSIFIER_ORGANIZATION_TAGTYPE = "HwROM_Classifier_organization";

    @objid ("0576357a-9a64-4e92-a91e-ae7971f2bd04")
    public static final String HWROM_CLASSIFIER_TYPE_TAGTYPE = "HwROM_Classifier_type";

    /**
     * Tells whether a {@link HwROMClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwROM_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d2057240-c5b2-45f1-af1a-244214d85896")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwROMClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwROM_Classifier >> then instantiate a {@link HwROMClassifier} proxy.
     * 
     * @return a {@link HwROMClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("b72065c6-133d-47e7-b939-36d340d13d3a")
    public static HwROMClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwROMClassifier.STEREOTYPE_NAME);
        return HwROMClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwROMClassifier} proxy from a {@link Classifier} stereotyped << HwROM_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwROMClassifier} proxy or <i>null</i>.
     */
    @objid ("75022868-bba2-4269-ab6d-a058c4b25c86")
    public static HwROMClassifier instantiate(final Classifier obj) {
        return HwROMClassifier.canInstantiate(obj) ? new HwROMClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwROMClassifier} proxy from a {@link Classifier} stereotyped << HwROM_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwROMClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8475b476-084b-4b74-b24b-1bb1042e5a9a")
    public static HwROMClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwROMClassifier.canInstantiate(obj))
        	return new HwROMClassifier(obj);
        else
        	throw new IllegalArgumentException("HwROMClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0ed23e36-2ceb-43d2-8796-503f3c99f87a")
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
        HwROMClassifier other = (HwROMClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("48a2c3af-2185-4329-8c3a-33b49fe99902")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwROM_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5acf295f-0a83-4846-be5b-92efec2fb146")
    public String getHwROM_Classifier_organization() {
        return this.elt.getTagValue(HwROMClassifier.MdaTypes.HWROM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwROM_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7a2329b-e77d-45ad-9490-b9483064f7f3")
    public String getHwROM_Classifier_type() {
        return this.elt.getTagValue(HwROMClassifier.MdaTypes.HWROM_CLASSIFIER_TYPE_TAGTYPE_ELT);
    }

    @objid ("36f0edb1-76de-4f6e-a885-efff0d0b332d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwROM_Classifier_organization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("65c7dd0f-5794-4f1c-aab1-9da9c1a534b0")
    public void setHwROM_Classifier_organization(final String value) {
        this.elt.putTagValue(HwROMClassifier.MdaTypes.HWROM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwROM_Classifier_type'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76214cdc-eef4-4bd8-8302-457899cc8746")
    public void setHwROM_Classifier_type(final String value) {
        this.elt.putTagValue(HwROMClassifier.MdaTypes.HWROM_CLASSIFIER_TYPE_TAGTYPE_ELT, value);
    }

    @objid ("57d07e40-849c-4c0c-ac27-f6b28f827238")
    protected HwROMClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("f630ef88-1d9d-4fc1-8713-7bd382e3b66e")
    public static final class MdaTypes {
        @objid ("cd59a4b4-79c5-41e8-bb6d-efa44362114c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("87747d83-ca1b-4e32-b08a-2bdd32cb5f28")
        public static TagType HWROM_CLASSIFIER_TYPE_TAGTYPE_ELT;

        @objid ("7b252855-5063-458b-89d6-5d4996a41b60")
        public static TagType HWROM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT;

        @objid ("72890cb1-ac6e-46d0-ba9b-0b60726c1b36")
        private static Stereotype MDAASSOCDEP;

        @objid ("07dd6d3a-f949-40ee-95f9-18376d4ce088")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d84e04f1-4050-46c2-9fb7-e61c3fc3ce75")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5eb5b1f7-1009-11df-86fe-0014222a9f79");
            HWROM_CLASSIFIER_TYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "910ed9dd-1009-11df-86fe-0014222a9f79");
            HWROM_CLASSIFIER_ORGANIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "910ed9de-1009-11df-86fe-0014222a9f79");
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
