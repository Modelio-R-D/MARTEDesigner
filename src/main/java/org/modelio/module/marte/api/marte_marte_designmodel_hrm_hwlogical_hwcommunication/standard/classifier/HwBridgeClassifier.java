/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("f48eaf67-e21a-4d4e-9f00-40dacab9b282")
    public static final String STEREOTYPE_NAME = "HwBridge_Classifier";

    @objid ("c3ed66f3-1ce7-46ff-9f04-b9e185e1b8d5")
    public static final String HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE = "HwBridge_Classifier_sides";

    /**
     * Tells whether a {@link HwBridgeClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwBridge_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("586d463c-96f7-467a-922d-0c41710fc3a0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwBridge_Classifier >> then instantiate a {@link HwBridgeClassifier} proxy.
     * 
     * @return a {@link HwBridgeClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("7744a3df-2212-46e2-8cc1-5166b89eb556")
    public static HwBridgeClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeClassifier.STEREOTYPE_NAME);
        return HwBridgeClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwBridgeClassifier} proxy from a {@link Classifier} stereotyped << HwBridge_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwBridgeClassifier} proxy or <i>null</i>.
     */
    @objid ("32d22267-7be6-489b-a0ca-246fe6218492")
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
    @objid ("c4d1c08c-3dd3-43c5-83a7-96fb13d837b1")
    public static HwBridgeClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwBridgeClassifier.canInstantiate(obj))
        	return new HwBridgeClassifier(obj);
        else
        	throw new IllegalArgumentException("HwBridgeClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f58d5650-9dfd-4b3b-9f34-b5d1911db1c1")
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
    @objid ("7bafb9eb-8622-480b-a7f7-e3e6afeb7b45")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwBridge_Classifier_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("373c8b94-ccf8-44a7-96e7-669f316c7f48")
    public List<String> getHwBridge_Classifier_sides() {
        return this.elt.getTagValues(HwBridgeClassifier.MdaTypes.HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE_ELT);
    }

    @objid ("99051331-1323-449c-9971-4fb40acfee9d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_Classifier_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1d0c1709-123e-4ba1-9dc0-dfd766aceb82")
    public void setHwBridge_Classifier_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeClassifier.MdaTypes.HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE_ELT, values);
    }

    @objid ("99568cf8-e628-4c1d-be18-d1261a34ff62")
    protected HwBridgeClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("336feca2-661d-4b64-89b3-867022e27140")
    public static final class MdaTypes {
        @objid ("82c246d8-a447-4eef-8376-64cdc8c06056")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("728da01c-8957-4e4f-9515-0cbfb81d468b")
        public static TagType HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE_ELT;

        @objid ("6b6909fe-f010-4e05-a81b-8ccfa079b9fd")
        private static Stereotype MDAASSOCDEP;

        @objid ("425bdbc8-cbfe-42ee-ae57-c125242ea90d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("555f17b1-c041-4fbf-9752-3f28383fb93b")
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
