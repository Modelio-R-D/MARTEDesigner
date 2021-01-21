/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend;

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
 * Proxy class to handle a {@link AssociationEnd} with << SynchronizationResource_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4a59bae3-9fe0-488d-9a5d-4c742955388f")
public class SynchronizationResourceAssociationEnd extends ResourceAssociationEnd {
    @objid ("a367e9c3-29c0-4054-8331-c248274718ab")
    public static final String STEREOTYPE_NAME = "SynchronizationResource_AssociationEnd";

    /**
     * Tells whether a {@link SynchronizationResourceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << SynchronizationResource_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("eb0378b7-23cb-4d5a-b543-804a5798c7f5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << SynchronizationResource_AssociationEnd >> then instantiate a {@link SynchronizationResourceAssociationEnd} proxy.
     * 
     * @return a {@link SynchronizationResourceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("ab78204a-e209-404f-8d86-06c0b2c627a7")
    public static SynchronizationResourceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceAssociationEnd.STEREOTYPE_NAME);
        return SynchronizationResourceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SynchronizationResource_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link SynchronizationResourceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("5a91994b-215c-47d4-b294-d6d885f0e5b8")
    public static SynchronizationResourceAssociationEnd instantiate(final AssociationEnd obj) {
        return SynchronizationResourceAssociationEnd.canInstantiate(obj) ? new SynchronizationResourceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << SynchronizationResource_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link SynchronizationResourceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c7b3b2ef-2703-487d-b30c-01c109aa31e3")
    public static SynchronizationResourceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (SynchronizationResourceAssociationEnd.canInstantiate(obj))
        	return new SynchronizationResourceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("SynchronizationResourceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4628d65b-a834-4629-8802-e67d06e9233b")
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
        SynchronizationResourceAssociationEnd other = (SynchronizationResourceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("3ff2594d-9ca2-421f-b717-54be70893cd1")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @objid ("9e403335-83e0-4c6f-a9df-f7a0fe0eb9d2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("ae32853d-cfd5-4257-a2d2-6fb930332f65")
    protected SynchronizationResourceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("a530f323-0ce5-4ec9-89ba-726784c0ecaa")
    public static final class MdaTypes {
        @objid ("1d3e41f7-ea50-4fc4-a2c8-665b75028453")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("71995a15-480a-4230-bf62-9982ddfb242a")
        private static Stereotype MDAASSOCDEP;

        @objid ("f2bdf5de-b453-4c79-8896-d2e88b82a39c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("74a8393b-4ef9-4be7-8504-3b3b98e13d0a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ffa75822-0cce-11df-8525-001302895b2b");
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
