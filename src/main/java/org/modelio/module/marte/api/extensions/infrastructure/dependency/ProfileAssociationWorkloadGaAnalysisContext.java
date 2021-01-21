/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_workload_GaAnalysisContext >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("40ea12c8-56ca-4772-9d5d-1281c523c464")
public class ProfileAssociationWorkloadGaAnalysisContext {
    @objid ("6bad82b0-ab46-446e-a5af-e9a60a7e34aa")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_workload_GaAnalysisContext";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("327ec9a5-8297-4ef5-a232-7c851e2697dc")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationWorkloadGaAnalysisContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_workload_GaAnalysisContext >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c5804815-7898-457a-897f-dfb13f951d98")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationWorkloadGaAnalysisContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_workload_GaAnalysisContext >> then instantiate a {@link ProfileAssociationWorkloadGaAnalysisContext} proxy.
     * 
     * @return a {@link ProfileAssociationWorkloadGaAnalysisContext} proxy on the created {@link Dependency}.
     */
    @objid ("0eed72bf-6144-4637-80ad-6967b2b67626")
    public static ProfileAssociationWorkloadGaAnalysisContext create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationWorkloadGaAnalysisContext.STEREOTYPE_NAME);
        return ProfileAssociationWorkloadGaAnalysisContext.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationWorkloadGaAnalysisContext} proxy from a {@link Dependency} stereotyped << ProfileAssociation_workload_GaAnalysisContext >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationWorkloadGaAnalysisContext} proxy or <i>null</i>.
     */
    @objid ("0fa7b1a4-46fc-445e-8ebd-b5f42c91c4cd")
    public static ProfileAssociationWorkloadGaAnalysisContext instantiate(final Dependency obj) {
        return ProfileAssociationWorkloadGaAnalysisContext.canInstantiate(obj) ? new ProfileAssociationWorkloadGaAnalysisContext(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationWorkloadGaAnalysisContext} proxy from a {@link Dependency} stereotyped << ProfileAssociation_workload_GaAnalysisContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationWorkloadGaAnalysisContext} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("90c36868-35fd-4cc2-bb7f-1ecab8221c41")
    public static ProfileAssociationWorkloadGaAnalysisContext safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationWorkloadGaAnalysisContext.canInstantiate(obj))
        	return new ProfileAssociationWorkloadGaAnalysisContext(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationWorkloadGaAnalysisContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c6a34585-6764-46eb-a516-5664cbe7cde5")
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
        ProfileAssociationWorkloadGaAnalysisContext other = (ProfileAssociationWorkloadGaAnalysisContext) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("36d584d0-cddf-4588-949d-e72fec60dbc7")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("b06a407b-fba1-4d02-9e64-adbe3c4b6223")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2bb9fd18-3d0a-4bcf-85a3-453cfe3fe07a")
    protected ProfileAssociationWorkloadGaAnalysisContext(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("afdf09f9-f648-443e-91e5-76aeb07b4d51")
    public static final class MdaTypes {
        @objid ("0710cc13-7753-47eb-b7be-4eafa4f605c4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9b208461-b9a7-4235-92cb-64828d42ab91")
        private static Stereotype MDAASSOCDEP;

        @objid ("341b33ae-7fb8-4449-ade8-15ed17c7ae82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f866e7ba-d9ec-49e2-bda9-08f3fa444d8a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cf3b9ca0-dd1f-11e0-a2be-0027103f347c");
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
