/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.classifier.HwResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwCommunicationResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9cb46b35-44c1-480d-a531-d45cee682f9d")
public class HwCommunicationResourceClassifier extends HwResourceClassifier {
    @objid ("598d1092-0f1e-4888-8701-54aa32abd1c4")
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_Classifier";

    /**
     * Tells whether a {@link HwCommunicationResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwCommunicationResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b775bbc9-ba65-4058-82ff-6726a7463484")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwCommunicationResource_Classifier >> then instantiate a {@link HwCommunicationResourceClassifier} proxy.
     * 
     * @return a {@link HwCommunicationResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("3631067a-e063-4582-b3b1-e87899f5146c")
    public static HwCommunicationResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceClassifier.STEREOTYPE_NAME);
        return HwCommunicationResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceClassifier} proxy from a {@link Classifier} stereotyped << HwCommunicationResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwCommunicationResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("6b9d4ca8-f472-4921-b0d6-de5bc9e13167")
    public static HwCommunicationResourceClassifier instantiate(final Classifier obj) {
        return HwCommunicationResourceClassifier.canInstantiate(obj) ? new HwCommunicationResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceClassifier} proxy from a {@link Classifier} stereotyped << HwCommunicationResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwCommunicationResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5d6e29a7-7336-46be-bc7e-ce022ae3bf80")
    public static HwCommunicationResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwCommunicationResourceClassifier.canInstantiate(obj))
        	return new HwCommunicationResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("04391842-ad2d-45ff-846b-a2fd855e5ce1")
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
        HwCommunicationResourceClassifier other = (HwCommunicationResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("2cda011f-d34a-4241-8436-5a42ed237b1b")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("56029f2d-50ce-4c6a-9c0e-1ea16786b587")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b95f7a99-975b-41ac-aed7-3b1ea928e5cd")
    protected HwCommunicationResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("b65b3ac7-a55f-4d2d-860d-b1fff5187413")
    public static final class MdaTypes {
        @objid ("f9c7bf75-164e-45a1-ac55-9eaaa49ce105")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bcd6f105-e004-473c-98d9-49cdb68e71c3")
        private static Stereotype MDAASSOCDEP;

        @objid ("194a8dd9-dad3-4953-80bf-e41ba2efd0e5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8077ea18-e213-43a8-a771-e34ef4b7a596")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fea646-0ccf-11df-8525-001302895b2b");
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
