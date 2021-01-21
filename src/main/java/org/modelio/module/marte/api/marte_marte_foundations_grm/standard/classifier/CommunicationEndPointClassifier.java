/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << CommunicationEndPoint_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("024d6dc4-166a-4d8e-bf05-3e7d97fe03eb")
public class CommunicationEndPointClassifier extends ResourceClassifier {
    @objid ("edfcd46a-edf2-4bcf-9dc4-6f497e1bce01")
    public static final String STEREOTYPE_NAME = "CommunicationEndPoint_Classifier";

    @objid ("0a60091d-c02f-488f-83cd-e5120a6c4626")
    public static final String COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE_TAGTYPE = "CommunicationEndPoint_Classifier_packetSize";

    /**
     * Tells whether a {@link CommunicationEndPointClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << CommunicationEndPoint_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1d9ff483-b754-4546-ab50-0da95e863d45")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << CommunicationEndPoint_Classifier >> then instantiate a {@link CommunicationEndPointClassifier} proxy.
     * 
     * @return a {@link CommunicationEndPointClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("208f636d-f433-4143-93d1-e0c4a4e8f93b")
    public static CommunicationEndPointClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, CommunicationEndPointClassifier.STEREOTYPE_NAME);
        return CommunicationEndPointClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointClassifier} proxy from a {@link Classifier} stereotyped << CommunicationEndPoint_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link CommunicationEndPointClassifier} proxy or <i>null</i>.
     */
    @objid ("56e95e68-29a5-4272-b5be-27c334aeca1c")
    public static CommunicationEndPointClassifier instantiate(final Classifier obj) {
        return CommunicationEndPointClassifier.canInstantiate(obj) ? new CommunicationEndPointClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationEndPointClassifier} proxy from a {@link Classifier} stereotyped << CommunicationEndPoint_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link CommunicationEndPointClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("56279f64-b141-4c37-b269-65c7971c68fa")
    public static CommunicationEndPointClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (CommunicationEndPointClassifier.canInstantiate(obj))
        	return new CommunicationEndPointClassifier(obj);
        else
        	throw new IllegalArgumentException("CommunicationEndPointClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6d884701-e132-47d3-8193-fed967248f2e")
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
        CommunicationEndPointClassifier other = (CommunicationEndPointClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'CommunicationEndPoint_Classifier_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("13c000ba-acaf-47f2-a355-99454a61ed1a")
    public String getCommunicationEndPoint_Classifier_packetSize() {
        return this.elt.getTagValue(CommunicationEndPointClassifier.MdaTypes.COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("d098da0f-0c4a-4892-b2b3-f73b029ce42e")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("557fde4d-3d8f-465c-a67e-e3b2d3c83c76")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'CommunicationEndPoint_Classifier_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c19e80a4-f9f6-4d6a-bbea-517ced487ac9")
    public void setCommunicationEndPoint_Classifier_packetSize(final String value) {
        this.elt.putTagValue(CommunicationEndPointClassifier.MdaTypes.COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE_TAGTYPE_ELT, value);
    }

    @objid ("032ec69a-06c9-4f1b-80da-c0db4ee66125")
    protected CommunicationEndPointClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("7939e1e1-9e85-41b2-9d90-08fdec1c4fb8")
    public static final class MdaTypes {
        @objid ("a8e44f58-18a2-4794-bbce-ec8478266191")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a203801e-8a21-4318-b334-e7684b0450d5")
        public static TagType COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE_TAGTYPE_ELT;

        @objid ("2a52ba5b-04cc-49c8-8717-fcb0c507c185")
        private static Stereotype MDAASSOCDEP;

        @objid ("c4ca2ce5-9ee5-4b45-a0fe-cb08c575b231")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8eae990d-a6fe-47ba-b30f-c7f8399c648f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa4f5db-0cce-11df-8525-001302895b2b");
            COMMUNICATIONENDPOINT_CLASSIFIER_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ffa4f5e2-0cce-11df-8525-001302895b2b");
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
