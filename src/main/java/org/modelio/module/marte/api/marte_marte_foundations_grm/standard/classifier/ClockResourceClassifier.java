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
 * Proxy class to handle a {@link Classifier} with << ClockResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("72e65db8-2b86-4ac6-a1c5-8c864a43cf23")
public class ClockResourceClassifier extends TimingResourceClassifier {
    @objid ("334a2264-3ee4-4cdf-8060-20ec81a024e4")
    public static final String STEREOTYPE_NAME = "ClockResource_Classifier";

    /**
     * Tells whether a {@link ClockResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << ClockResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("35739f17-e270-4a9d-8c9e-5cca7994ab6d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << ClockResource_Classifier >> then instantiate a {@link ClockResourceClassifier} proxy.
     * 
     * @return a {@link ClockResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("e1a99190-f3e7-4a9a-af44-d165bd47b91b")
    public static ClockResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceClassifier.STEREOTYPE_NAME);
        return ClockResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link ClockResourceClassifier} proxy from a {@link Classifier} stereotyped << ClockResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link ClockResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("949e8983-91a2-4bd2-89a2-6a5a8cbce17f")
    public static ClockResourceClassifier instantiate(final Classifier obj) {
        return ClockResourceClassifier.canInstantiate(obj) ? new ClockResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockResourceClassifier} proxy from a {@link Classifier} stereotyped << ClockResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link ClockResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e40c5725-edd6-4705-83a4-3cf06bc42485")
    public static ClockResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (ClockResourceClassifier.canInstantiate(obj))
        	return new ClockResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("ClockResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bad843fc-c131-49f2-a541-917b7c8e3b2b")
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
        ClockResourceClassifier other = (ClockResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("caa17331-aa50-440c-b9d4-43ad6a8e92e4")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("fc41552f-3e8f-40ff-af52-397713e16ab7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("dafa26ee-de60-47db-bcb0-7d766e9d4d24")
    protected ClockResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("b6998fad-609b-4da3-a630-4c117f9f7f40")
    public static final class MdaTypes {
        @objid ("29239f38-4ac3-44c6-bfc3-083205f32223")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7ab89d25-ec48-442b-9d5d-92655d17627e")
        private static Stereotype MDAASSOCDEP;

        @objid ("7253222b-3044-4664-822a-a8f75c1201fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b924655-29ce-4855-b460-62c25f70b68c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dc3c5f1f-0f42-11df-8c52-0014222a9f79");
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
