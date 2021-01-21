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
 * Proxy class to handle a {@link Classifier} with << ComputingResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a71ef4aa-8b23-42cc-9629-0fe205fa4757")
public class ComputingResourceClassifier extends ProcessingResourceClassifier {
    @objid ("7e44b3c0-ea27-4563-9f39-e5d60405fa6a")
    public static final String STEREOTYPE_NAME = "ComputingResource_Classifier";

    /**
     * Tells whether a {@link ComputingResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << ComputingResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("488af261-3fd3-4a02-af93-1f2aeecccd98")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << ComputingResource_Classifier >> then instantiate a {@link ComputingResourceClassifier} proxy.
     * 
     * @return a {@link ComputingResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("914b2d1d-a543-495f-80f2-a956cac8c470")
    public static ComputingResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceClassifier.STEREOTYPE_NAME);
        return ComputingResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link ComputingResourceClassifier} proxy from a {@link Classifier} stereotyped << ComputingResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link ComputingResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("f29d6e8b-c42c-4f78-bf04-fb7fdbc9027e")
    public static ComputingResourceClassifier instantiate(final Classifier obj) {
        return ComputingResourceClassifier.canInstantiate(obj) ? new ComputingResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ComputingResourceClassifier} proxy from a {@link Classifier} stereotyped << ComputingResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link ComputingResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c02dea43-82a3-4de5-a751-5f48a9c18e45")
    public static ComputingResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (ComputingResourceClassifier.canInstantiate(obj))
        	return new ComputingResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("ComputingResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3a5263d3-d379-41b0-bc70-ca505694e5b1")
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
        ComputingResourceClassifier other = (ComputingResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("3dfa7fc7-c89f-4b6d-80f2-64e68fd23c14")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("b8e4bcec-edd4-4517-8b03-8912423a395b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("99d905cb-0c08-48d3-892f-d3163121694d")
    protected ComputingResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("e536520a-7e7e-49e4-b48c-ceeff6648778")
    public static final class MdaTypes {
        @objid ("abe798c1-e78f-46da-b358-a903e491e55a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0f486b73-ba32-4544-9c82-9b32b6c9fdd8")
        private static Stereotype MDAASSOCDEP;

        @objid ("30d4234b-30f7-4eb1-9488-0461f8235b3f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9c84afb6-7cf8-49a5-9faf-08e06975741e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1d36fe03-1019-11df-86fe-0014222a9f79");
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
