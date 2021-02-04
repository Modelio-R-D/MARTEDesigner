/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwBridge_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("81fff9a9-73dc-4600-b77a-13586c7f635d")
public class HwBridgeClassifier extends HwMediaClassifier {
    @objid ("1240733c-8988-4b9c-8098-df7adc432d6e")
    public static final String STEREOTYPE_NAME = "HwBridge_Classifier";

    @objid ("881e0bf4-df10-421b-a352-3efa3f338f00")
    public static final String HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE = "HwBridge_Classifier_sides";

    /**
     * Tells whether a {@link HwBridgeClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwBridge_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("eb16a442-5f11-421b-b974-a2cc093e2ddf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwBridge_Classifier >> then instantiate a {@link HwBridgeClassifier} proxy.
     * 
     * @return a {@link HwBridgeClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("fe8580de-1366-4468-9b2c-317757a9d77e")
    public static HwBridgeClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeClassifier.STEREOTYPE_NAME);
        return HwBridgeClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeClassifier} proxy from a {@link Classifier} stereotyped << HwBridge_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwBridgeClassifier} proxy or <i>null</i>.
     */
    @objid ("fa68744e-76ba-4bd7-adab-61d6fe51c4c1")
    public static HwBridgeClassifier instantiate(final Classifier obj) {
        return HwBridgeClassifier.canInstantiate(obj) ? new HwBridgeClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBridgeClassifier} proxy from a {@link Classifier} stereotyped << HwBridge_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwBridgeClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f6b9ea86-0828-4b03-8e60-a06b16458a6e")
    public static HwBridgeClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwBridgeClassifier.canInstantiate(obj))
        	return new HwBridgeClassifier(obj);
        else
        	throw new IllegalArgumentException("HwBridgeClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8fe86b52-c4a7-4ecd-a649-508719528543")
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
        HwBridgeClassifier other = (HwBridgeClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("83f2d836-a69d-4b28-aba4-1035616208a8")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_Classifier_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("05293648-c115-4a74-8e7c-9a0b65abafb7")
    public List<String> getHwBridge_Classifier_sides() {
        return this.elt.getTagValues(HwBridgeClassifier.MdaTypes.HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE_ELT);
    }

    @objid ("8c68fbfc-9213-4f87-8c83-df32c4e86d32")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_Classifier_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49e5565e-0764-4782-b8d7-e474df54b034")
    public void setHwBridge_Classifier_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeClassifier.MdaTypes.HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE_ELT, values);
    }

    @objid ("be9c05d0-ddbf-4997-b026-0bcaf0ac6e24")
    protected HwBridgeClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("336feca2-661d-4b64-89b3-867022e27140")
    public static final class MdaTypes {
        @objid ("810a44c0-174f-4a8d-91f5-251ccd68d3e5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("03614e29-49b4-4724-a9a7-a2b433a085b0")
        public static TagType HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE_ELT;

        @objid ("84ebffbf-9a4f-4d2e-badc-5cee4c351685")
        private static Stereotype MDAASSOCDEP;

        @objid ("45482a90-4e15-42bb-9a5b-a402f940be4a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4a7ac62-0670-4a18-841e-e8accbd45eaa")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e82bae31-10ac-11df-81d9-0014222a9f79");
            HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "be54f8c4-1726-11df-b92a-0014222a9f79");
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
