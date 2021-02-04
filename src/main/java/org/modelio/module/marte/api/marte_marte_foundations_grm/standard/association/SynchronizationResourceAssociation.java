/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("96aea509-a22f-4604-80c4-01bf222fa44f")
    public static final String STEREOTYPE_NAME = "SynchronizationResource_Association";

    /**
     * Tells whether a {@link SynchronizationResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SynchronizationResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bc0449b7-35d7-4140-8d3c-20a3b3a1c26a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SynchronizationResource_Association >> then instantiate a {@link SynchronizationResourceAssociation} proxy.
     * 
     * @return a {@link SynchronizationResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("cd483c10-2de2-495d-830b-18344be79ee7")
    public static SynchronizationResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SynchronizationResourceAssociation.STEREOTYPE_NAME);
        return SynchronizationResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SynchronizationResourceAssociation} proxy from a {@link Association} stereotyped << SynchronizationResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SynchronizationResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("dc075eb4-e3ac-4381-8f00-6aab75ffd106")
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
    @objid ("8e241e54-a00a-4ba7-b7be-831cb90ca7bf")
    public static SynchronizationResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SynchronizationResourceAssociation.canInstantiate(obj))
        	return new SynchronizationResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SynchronizationResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("16d6309c-a77e-4dd8-8df0-12970bdfe5f2")
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
    @objid ("903e9259-ba78-465e-94a7-45b975af14cc")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("efcd5680-4414-465a-9c2f-0410f9561485")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6a0d9e1d-aa52-4dd1-a4b8-20e1ce26b668")
    protected SynchronizationResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("3b89e643-138f-47ad-b36b-2a31ed90e844")
    public static final class MdaTypes {
        @objid ("008f7cf7-a6bd-46c0-a595-54d59cd63724")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("49396610-e49e-4d51-bf9e-b0e666c48bee")
        private static Stereotype MDAASSOCDEP;

        @objid ("44a006e9-3b83-451f-9481-e197fe4e9ee8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("36736349-1966-4a27-ac83-7303beb62d5f")
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
