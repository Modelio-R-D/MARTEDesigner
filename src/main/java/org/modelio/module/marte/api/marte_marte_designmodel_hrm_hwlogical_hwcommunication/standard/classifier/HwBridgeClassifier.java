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
public class HwBridgeClassifier extends HwMediaClassifier {
    public static final String STEREOTYPE_NAME = "HwBridge_Classifier";

    public static final String HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE = "HwBridge_Classifier_sides";

    /**
     * Tells whether a {@link HwBridgeClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwBridge_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBridgeClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwBridge_Classifier >> then instantiate a {@link HwBridgeClassifier} proxy.
     * 
     * @return a {@link HwBridgeClassifier} proxy on the created {@link Classifier}.
     */
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
    public static HwBridgeClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwBridgeClassifier.canInstantiate(obj))
        	return new HwBridgeClassifier(obj);
        else
        	throw new IllegalArgumentException("HwBridgeClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwBridgeClassifier other = (HwBridgeClassifier) obj;
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
     * Getter for List<String> property 'HwBridge_Classifier_sides'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwBridge_Classifier_sides() {
        return this.elt.getTagValues(HwBridgeClassifier.MdaTypes.HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwBridge_Classifier_sides'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBridge_Classifier_sides(final List<String> values) {
        this.elt.putTagValues(HwBridgeClassifier.MdaTypes.HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE_ELT, values);
    }

    protected HwBridgeClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWBRIDGE_CLASSIFIER_SIDES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
