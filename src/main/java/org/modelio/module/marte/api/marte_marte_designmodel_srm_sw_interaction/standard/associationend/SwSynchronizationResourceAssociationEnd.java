/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << SwSynchronizationResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5fa3d9da-5822-4c77-b47f-569e2ac88e92")
public class SwSynchronizationResourceAssociationEnd extends SwInteractionResourceAssociationEnd {
    @objid ("e13b8827-0b21-4587-8c8a-603fffdb442c")
    public static final String STEREOTYPE_NAME = "SwSynchronizationResource_AssociationEnd";

    /**
     * Tells whether a {@link SwSynchronizationResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SwSynchronizationResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("f0217a98-9109-4c35-9ddd-07d84a15867c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SwSynchronizationResource_AssociationEnd >> then instantiate a {@link SwSynchronizationResourceAssociationEnd} proxy.
     * 
     * @return a {@link SwSynchronizationResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("bd4d27f9-cbd4-4174-9b28-3f0e16b38dde")
    public static SwSynchronizationResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwSynchronizationResourceAssociationEnd.STEREOTYPE_NAME);
        return SwSynchronizationResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwSynchronizationResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SwSynchronizationResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("33134dc4-3899-42de-b8f7-9cdd36a30efb")
    public static SwSynchronizationResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SwSynchronizationResourceAssociationEnd.canInstantiate(obj) ? new SwSynchronizationResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwSynchronizationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SwSynchronizationResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SwSynchronizationResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4edbcf78-10dc-4c23-bab6-1bf1ac165fa5")
    public static SwSynchronizationResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SwSynchronizationResourceAssociationEnd.canInstantiate(obj))
        	return new SwSynchronizationResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SwSynchronizationResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c6c2705c-7d2d-496c-8673-17a8ff2ab396")
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
        SwSynchronizationResourceAssociationEnd other = (SwSynchronizationResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("fa5d5d94-f361-4715-99d6-4284dfca8e9c")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("911d689b-eaa0-4c45-b4c1-e2f1e21bd753")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("04df0800-33cf-4e96-9ec3-182e2f3c6a59")
    protected SwSynchronizationResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("f7bb83d2-4540-43dc-8d5c-59fa8c94e1bb")
    public static final class MdaTypes {
        @objid ("3315fe92-244f-4396-a6ff-0eaf291b1345")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3125da72-d021-4abd-bf8e-6fcf1935ccef")
        private static Stereotype MDAASSOCDEP;

        @objid ("9462c8b0-19c6-4693-a7e9-5854c9576e4f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ea6aefbf-3850-4648-b701-d263922905bb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0217f80f-0ccf-11df-8525-001302895b2b");
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
