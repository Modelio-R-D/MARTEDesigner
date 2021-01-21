/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.collaborationuse;

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
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaborationuse.GrServiceCollaborationUse;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link CollaborationUse} with << SwAccessService_CollaborationUse >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5a1b8009-98ef-4c91-bde1-d6412e6a89bd")
public class SwAccessServiceCollaborationUse extends GrServiceCollaborationUse {
    @objid ("0092ffb9-2b04-43db-881c-dd915fce26d4")
    public static final String STEREOTYPE_NAME = "SwAccessService_CollaborationUse";

    @objid ("be075d97-35e0-46be-9474-4969af780970")
    public static final String SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT_TAGTYPE = "SwAccessService_CollaborationUse_accessedElement";

    @objid ("1cf8467b-cc81-4028-83bb-732f9e3254a6")
    public static final String SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE = "SwAccessService_CollaborationUse_isModifier";

    /**
     * Tells whether a {@link SwAccessServiceCollaborationUse proxy} can be instantiated from a {@link MObject} checking it is a {@link CollaborationUse} stereotyped << SwAccessService_CollaborationUse >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0f70d0bd-2d29-4954-8594-c6c590ab5eb1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CollaborationUse) && ((CollaborationUse) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceCollaborationUse.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CollaborationUse} stereotyped << SwAccessService_CollaborationUse >> then instantiate a {@link SwAccessServiceCollaborationUse} proxy.
     * 
     * @return a {@link SwAccessServiceCollaborationUse} proxy on the created {@link CollaborationUse}.
     */
    @objid ("a84a301a-75a3-4a8e-99c9-894b871b63c2")
    public static SwAccessServiceCollaborationUse create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("CollaborationUse");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceCollaborationUse.STEREOTYPE_NAME);
        return SwAccessServiceCollaborationUse.instantiate((CollaborationUse)e);
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << SwAccessService_CollaborationUse >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CollaborationUse
     * @return a {@link SwAccessServiceCollaborationUse} proxy or <i>null</i>.
     */
    @objid ("dae596af-43a8-44db-b411-677c349c7284")
    public static SwAccessServiceCollaborationUse instantiate(final CollaborationUse obj) {
        return SwAccessServiceCollaborationUse.canInstantiate(obj) ? new SwAccessServiceCollaborationUse(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceCollaborationUse} proxy from a {@link CollaborationUse} stereotyped << SwAccessService_CollaborationUse >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CollaborationUse}
     * @return a {@link SwAccessServiceCollaborationUse} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7f682773-29f5-487b-8a8e-654415bc8660")
    public static SwAccessServiceCollaborationUse safeInstantiate(final CollaborationUse obj) throws IllegalArgumentException {
        if (SwAccessServiceCollaborationUse.canInstantiate(obj))
        	return new SwAccessServiceCollaborationUse(obj);
        else
        	throw new IllegalArgumentException("SwAccessServiceCollaborationUse: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3fcc79c4-a53d-47d5-b73b-14bf19144126")
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
        SwAccessServiceCollaborationUse other = (SwAccessServiceCollaborationUse) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CollaborationUse}. 
     * @return the CollaborationUse represented by this proxy, never null.
     */
    @objid ("4b7a3c17-1925-479c-8dc3-85f3ba59d623")
    @Override
    public CollaborationUse getElement() {
        return (CollaborationUse)super.getElement();
    }

    /**
     * Getter for string property 'SwAccessService_CollaborationUse_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("242e19f7-6931-43b3-92c3-56e068d9832f")
    public String getSwAccessService_CollaborationUse_accessedElement() {
        return this.elt.getTagValue(SwAccessServiceCollaborationUse.MdaTypes.SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT_TAGTYPE_ELT);
    }

    @objid ("20c2dc59-e65e-4884-8111-0083bd1133e1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwAccessService_CollaborationUse_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e100c287-8685-4cd9-9a25-ca3f9ac1fef8")
    public boolean isSwAccessService_CollaborationUse_isModifier() {
        return this.elt.isTagged(SwAccessServiceCollaborationUse.MdaTypes.SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SwAccessService_CollaborationUse_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7f9a58a4-ad9d-4848-8fed-7bb41f86648e")
    public void setSwAccessService_CollaborationUse_accessedElement(final String value) {
        this.elt.putTagValue(SwAccessServiceCollaborationUse.MdaTypes.SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwAccessService_CollaborationUse_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e92866d8-3c0f-4e9e-bac0-465809751110")
    public void setSwAccessService_CollaborationUse_isModifier(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwAccessServiceCollaborationUse.MdaTypes.SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwAccessServiceCollaborationUse.MdaTypes.SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE_ELT);
    }

    @objid ("36731c57-8bdc-472b-bf82-f92a087e1548")
    protected SwAccessServiceCollaborationUse(final CollaborationUse elt) {
        super(elt);
    }

    @objid ("86bd1a83-396c-41d5-a2fa-4816c05be6a2")
    public static final class MdaTypes {
        @objid ("ae08987f-9aea-4b30-84a0-c56bc3f532ee")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("08c865f6-2936-43bf-adab-ce56e24f3325")
        public static TagType SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE_ELT;

        @objid ("bda9aa2a-bc8b-42a0-a39c-f6be512ff856")
        public static TagType SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT_TAGTYPE_ELT;

        @objid ("e641fe5d-8b83-4324-b3cb-7e9c4badca1f")
        private static Stereotype MDAASSOCDEP;

        @objid ("c5eb9a54-540a-44f9-ad06-633d369b8c55")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("72f03052-187a-4348-8c5f-4b55da327432")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a7eb02-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_COLLABORATIONUSE_ISMODIFIER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb08-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_COLLABORATIONUSE_ACCESSEDELEMENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb0e-0ccf-11df-8525-001302895b2b");
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
