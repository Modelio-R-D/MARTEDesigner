/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.collaboration;

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
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.collaboration.GrServiceCollaboration;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Collaboration} with << SwAccessService_Collaboration >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e8e83996-5e41-4a72-87e1-e2d3e7e63cd5")
public class SwAccessServiceCollaboration extends GrServiceCollaboration {
    @objid ("ba97d8fa-c371-4037-9a6b-2a38b624d402")
    public static final String STEREOTYPE_NAME = "SwAccessService_Collaboration";

    @objid ("69505952-29b5-4f9d-9aff-a6387e0c90d1")
    public static final String SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE = "SwAccessService_Collaboration_accessedElement";

    @objid ("65a84454-6420-49cc-9646-e0d429a50e61")
    public static final String SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE = "SwAccessService_Collaboration_isModifier";

    /**
     * Tells whether a {@link SwAccessServiceCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << SwAccessService_Collaboration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9e593743-9c78-4461-899a-328897689eef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << SwAccessService_Collaboration >> then instantiate a {@link SwAccessServiceCollaboration} proxy.
     * 
     * @return a {@link SwAccessServiceCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("ba9b6f87-2df4-4df1-aa25-246963cb5fd6")
    public static SwAccessServiceCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceCollaboration.STEREOTYPE_NAME);
        return SwAccessServiceCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceCollaboration} proxy from a {@link Collaboration} stereotyped << SwAccessService_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link SwAccessServiceCollaboration} proxy or <i>null</i>.
     */
    @objid ("ca70c672-de22-4b19-a62f-18bf2b7ef17e")
    public static SwAccessServiceCollaboration instantiate(final Collaboration obj) {
        return SwAccessServiceCollaboration.canInstantiate(obj) ? new SwAccessServiceCollaboration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceCollaboration} proxy from a {@link Collaboration} stereotyped << SwAccessService_Collaboration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Collaboration}
     * @return a {@link SwAccessServiceCollaboration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("51a982eb-5b05-4ac0-812f-1df7219a7e48")
    public static SwAccessServiceCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (SwAccessServiceCollaboration.canInstantiate(obj))
        	return new SwAccessServiceCollaboration(obj);
        else
        	throw new IllegalArgumentException("SwAccessServiceCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b6dea49c-daa1-41db-8f69-4b4a829a892a")
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
        SwAccessServiceCollaboration other = (SwAccessServiceCollaboration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Collaboration}. 
     * @return the Collaboration represented by this proxy, never null.
     */
    @objid ("c377326f-2a77-4b50-88c3-03b5cbb437a5")
    @Override
    public Collaboration getElement() {
        return (Collaboration)super.getElement();
    }

    /**
     * Getter for string property 'SwAccessService_Collaboration_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6850b68d-a785-4720-8015-23c0f40af10d")
    public String getSwAccessService_Collaboration_accessedElement() {
        return this.elt.getTagValue(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE_ELT);
    }

    @objid ("e6cf4d02-4b61-46e0-be62-1e3a3d6134ab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwAccessService_Collaboration_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6482fa5b-cdba-4b2e-9e90-310881bb2954")
    public boolean isSwAccessService_Collaboration_isModifier() {
        return this.elt.isTagged(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SwAccessService_Collaboration_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8111d592-a1ed-46de-8dbe-c9d78c05ed44")
    public void setSwAccessService_Collaboration_accessedElement(final String value) {
        this.elt.putTagValue(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwAccessService_Collaboration_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa29c2f7-705c-477a-81d6-7ab82cd12d7a")
    public void setSwAccessService_Collaboration_isModifier(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT);
    }

    @objid ("d39f45fb-9e5f-48d1-95b2-abc778991672")
    protected SwAccessServiceCollaboration(final Collaboration elt) {
        super(elt);
    }

    @objid ("1365e5df-6c1c-49f8-9741-cbe07f23be5d")
    public static final class MdaTypes {
        @objid ("d26cb02e-c046-4160-817f-c3133d428203")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e1636552-7dde-492f-a088-4d61054fc675")
        public static TagType SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT;

        @objid ("28b99569-7667-4a29-96fc-2e720f783316")
        public static TagType SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE_ELT;

        @objid ("e9b8ed01-39c1-43bd-a934-151cc138275b")
        private static Stereotype MDAASSOCDEP;

        @objid ("9c45ac7e-3388-4204-8adb-ebdd23ca7177")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("075cda46-b011-4127-88d3-ec870b5b3bb9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01a7eb01-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb07-0ccf-11df-8525-001302895b2b");
            SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01a7eb0d-0ccf-11df-8525-001302895b2b");
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
