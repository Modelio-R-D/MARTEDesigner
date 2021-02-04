/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SwSynchronizationResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6d8f63e8-92c3-4d90-bb81-8fb27c4d15cc")
public class SwSynchronizationResourceAssociation extends SwInteractionResourceAssociation {
    @objid ("97633614-b7f7-4b36-bbee-578a76cdb6f8")
    public static final String STEREOTYPE_NAME = "SwSynchronizationResource_Association";

    /**
     * Tells whether a {@link SwSynchronizationResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwSynchronizationResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ad2f9952-27cd-42d5-8804-2e45484457d3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwSynchronizationResource_Association >> then instantiate a {@link SwSynchronizationResourceAssociation} proxy.
     * 
     * @return a {@link SwSynchronizationResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("95590f4f-3900-4fe9-9f41-eae3ef88461e")
    public static SwSynchronizationResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceAssociation.STEREOTYPE_NAME);
        return SwSynchronizationResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceAssociation} proxy from a {@link Association} stereotyped << SwSynchronizationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwSynchronizationResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("c29c2759-ece4-452c-b840-a59d925602a1")
    public static SwSynchronizationResourceAssociation instantiate(final Association obj) {
        return SwSynchronizationResourceAssociation.canInstantiate(obj) ? new SwSynchronizationResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceAssociation} proxy from a {@link Association} stereotyped << SwSynchronizationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwSynchronizationResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b9318721-625e-469c-9123-551e984359b3")
    public static SwSynchronizationResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwSynchronizationResourceAssociation.canInstantiate(obj))
        	return new SwSynchronizationResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwSynchronizationResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("91f5bbdc-5ea5-4db2-b261-c779ec4756a8")
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
        SwSynchronizationResourceAssociation other = (SwSynchronizationResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("928d90c3-5b45-4a19-bf58-65fb4570ae81")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("57b0d435-7819-4166-887b-a9577a021386")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("bc9c100a-3831-46fc-aab9-8cd8df4e928b")
    protected SwSynchronizationResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("3206515b-6448-41a1-a3d5-757ff83b7e83")
    public static final class MdaTypes {
        @objid ("72807f4e-c318-44e9-9b74-65a474d906a5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b87f5c23-b0ab-400a-851a-6cdda804671e")
        private static Stereotype MDAASSOCDEP;

        @objid ("c37b1aab-b47c-4b25-8258-d523ed7a1fff")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5f9f16e3-7b8c-499a-93a0-a00050ded008")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3d63fb19-10d9-11df-81d9-0014222a9f79");
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
