/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

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
 * Proxy class to handle a {@link Classifier} with << SwSynchronizationResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("cac2096e-c983-4ea9-ba26-71db6c006858")
public class SwSynchronizationResourceClassifier extends SwInteractionResourceClassifier {
    @objid ("c3f424ba-40e3-4899-a77b-6f6c0e72d05d")
    public static final String STEREOTYPE_NAME = "SwSynchronizationResource_Classifier";

    /**
     * Tells whether a {@link SwSynchronizationResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwSynchronizationResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5b307432-12db-484e-9cec-3ee6369ffb4e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwSynchronizationResource_Classifier >> then instantiate a {@link SwSynchronizationResourceClassifier} proxy.
     * 
     * @return a {@link SwSynchronizationResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("27a012c9-db2f-4732-9295-bfc3d1439a1c")
    public static SwSynchronizationResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceClassifier.STEREOTYPE_NAME);
        return SwSynchronizationResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceClassifier} proxy from a {@link Classifier} stereotyped << SwSynchronizationResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwSynchronizationResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("9f63671f-512b-48be-8922-d3b61a24ce6a")
    public static SwSynchronizationResourceClassifier instantiate(final Classifier obj) {
        return SwSynchronizationResourceClassifier.canInstantiate(obj) ? new SwSynchronizationResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceClassifier} proxy from a {@link Classifier} stereotyped << SwSynchronizationResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwSynchronizationResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7586ed00-7074-4752-87b6-349f1cc50994")
    public static SwSynchronizationResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwSynchronizationResourceClassifier.canInstantiate(obj))
        	return new SwSynchronizationResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwSynchronizationResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a851efa6-487b-4e6e-b8e6-bcd6deb25635")
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
        SwSynchronizationResourceClassifier other = (SwSynchronizationResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("90cb4ff1-86e6-412a-bc50-8ebf942de73b")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    @objid ("c8cce24d-f27b-465b-9597-651b3c647c8a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2c20fc06-5e10-4cf9-b865-70b4e63f4c8b")
    protected SwSynchronizationResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("676719cc-0b2f-4a25-bc7a-2a81eb0b172d")
    public static final class MdaTypes {
        @objid ("28aa83dd-2fd9-4ea9-9763-7517a4869925")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e98b261d-d00c-497d-bff3-107dfd2c6f2a")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f87cddd-968a-4da5-b13a-da42a2191ffa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e37a9618-2b8a-4562-b175-57f432d7dcbe")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3da1f88b-10d9-11df-81d9-0014222a9f79");
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
