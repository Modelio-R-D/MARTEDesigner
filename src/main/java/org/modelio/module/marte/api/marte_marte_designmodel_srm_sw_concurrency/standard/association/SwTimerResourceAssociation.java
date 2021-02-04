/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.association;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.TimerResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SwTimerResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("106c7f4d-6b94-46e7-931f-7f65f7b53016")
public class SwTimerResourceAssociation extends TimerResourceAssociation {
    @objid ("686ff2b9-7252-486f-8b56-2c8a3eeebf93")
    public static final String STEREOTYPE_NAME = "SwTimerResource_Association";

    /**
     * Tells whether a {@link SwTimerResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SwTimerResource_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f44963f1-7ba7-49ba-b13b-c3889de5f654")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SwTimerResource_Association >> then instantiate a {@link SwTimerResourceAssociation} proxy.
     * 
     * @return a {@link SwTimerResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("67cfa9bf-5935-428c-964d-aa90b87c4be3")
    public static SwTimerResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwTimerResourceAssociation.STEREOTYPE_NAME);
        return SwTimerResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceAssociation} proxy from a {@link Association} stereotyped << SwTimerResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SwTimerResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("6fb0d017-41cd-4c0d-9abf-ea61530ef155")
    public static SwTimerResourceAssociation instantiate(final Association obj) {
        return SwTimerResourceAssociation.canInstantiate(obj) ? new SwTimerResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwTimerResourceAssociation} proxy from a {@link Association} stereotyped << SwTimerResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SwTimerResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f0037ee9-2eaf-4194-a591-28bb31815995")
    public static SwTimerResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SwTimerResourceAssociation.canInstantiate(obj))
        	return new SwTimerResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("SwTimerResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("372eb5f2-57f2-4136-9e32-2d998519e6ec")
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
        SwTimerResourceAssociation other = (SwTimerResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("c2856ded-3546-4fa8-b46d-ccb62a595b4f")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("40d256b1-5889-459b-b44c-145a8cb92329")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("05f6059c-946d-418b-8e6f-8216b697d14f")
    protected SwTimerResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("31a4a7ee-e47c-4139-a0a9-c7d06bdce03c")
    public static final class MdaTypes {
        @objid ("e0a5b4b3-d47b-40e5-853d-34596ac54b02")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("72d8db0a-5336-4e58-9fe0-56aad89cd829")
        private static Stereotype MDAASSOCDEP;

        @objid ("0e175edf-9e60-4811-946a-8e894ba65039")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b07d281e-d038-4bd1-a0fe-dc624eb45ea1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aca41632-10cf-11df-81d9-0014222a9f79");
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
