/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
 * Proxy class to handle a {@link Association} with << SynchronizationResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6819ff1c-59f0-475a-90dd-ae444c7ee82f")
public class SynchronizationResourceAssociation extends SchedulableResourceAssociation {
    @objid ("1e1105c4-3ede-4e42-aa2c-2d8eca28644c")
    public static final String STEREOTYPE_NAME = "SynchronizationResource_Association";

    /**
     * Tells whether a {@link SynchronizationResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SynchronizationResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("28d94622-decc-458b-b1af-b76b74ce3035")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SynchronizationResource_Association >> then instantiate a {@link SynchronizationResourceAssociation} proxy.
     * 
     * @return a {@link SynchronizationResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("406df486-7a82-4d6e-acf1-c4d1ba885a7f")
    public static SynchronizationResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceAssociation.STEREOTYPE_NAME);
        return SynchronizationResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceAssociation} proxy from a {@link Association} stereotyped << SynchronizationResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SynchronizationResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("5cc459e2-ac1c-4751-b9b3-c69b883f719b")
    public static SynchronizationResourceAssociation instantiate(final Association obj) {
        return SynchronizationResourceAssociation.canInstantiate(obj) ? new SynchronizationResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceAssociation} proxy from a {@link Association} stereotyped << SynchronizationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SynchronizationResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("736153ed-d4cd-43a0-9662-9378a1b1e635")
    public static SynchronizationResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SynchronizationResourceAssociation.canInstantiate(obj))
        	return new SynchronizationResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SynchronizationResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c9edd85d-0733-4f28-9212-3713fc0d0240")
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
        SynchronizationResourceAssociation other = (SynchronizationResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("4c84122c-05e3-4b16-9108-4cc7a29b3ced")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("79513445-22bc-4cb7-8b77-25ac2317684a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1074b967-f37f-4465-bbf9-e97080f79745")
    protected SynchronizationResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("3b89e643-138f-47ad-b36b-2a31ed90e844")
    public static final class MdaTypes {
        @objid ("46023917-b1c4-4548-9ddf-cc57662d22d5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2ee8a757-fcf8-4b48-8964-1eebe2edd0c0")
        private static Stereotype MDAASSOCDEP;

        @objid ("137aa38a-06dd-471e-954c-d968517eedd4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16db267b-fa5c-4ae6-b59b-234ea9347791")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1df3688b-0f4d-11df-8c52-0014222a9f79");
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
