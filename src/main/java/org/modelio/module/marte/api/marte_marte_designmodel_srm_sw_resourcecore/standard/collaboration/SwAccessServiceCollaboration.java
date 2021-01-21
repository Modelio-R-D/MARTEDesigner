/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("362c7978-6ce6-42d3-bb8e-f87af9a8af0c")
    public static final String STEREOTYPE_NAME = "SwAccessService_Collaboration";

    @objid ("28e97e2f-cfec-4fd7-8a20-f377a9cded15")
    public static final String SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE = "SwAccessService_Collaboration_accessedElement";

    @objid ("d4be846f-b4fd-4482-8563-ae15ea4b6786")
    public static final String SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE = "SwAccessService_Collaboration_isModifier";

    /**
     * Tells whether a {@link SwAccessServiceCollaboration proxy} can be instantiated from a {@link MObject} checking it is a {@link Collaboration} stereotyped << SwAccessService_Collaboration >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("200f7bfc-4316-4b6d-8d3f-6bc3a61b8179")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Collaboration) && ((Collaboration) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceCollaboration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Collaboration} stereotyped << SwAccessService_Collaboration >> then instantiate a {@link SwAccessServiceCollaboration} proxy.
     * 
     * @return a {@link SwAccessServiceCollaboration} proxy on the created {@link Collaboration}.
     */
    @objid ("aac46e10-1e61-4ae2-be35-ac9fa2206132")
    public static SwAccessServiceCollaboration create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Collaboration");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwAccessServiceCollaboration.STEREOTYPE_NAME);
        return SwAccessServiceCollaboration.instantiate((Collaboration)e);
    }

    /**
     * Tries to instantiate a {@link SwAccessServiceCollaboration} proxy from a {@link Collaboration} stereotyped << SwAccessService_Collaboration >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Collaboration
     * @return a {@link SwAccessServiceCollaboration} proxy or <i>null</i>.
     */
    @objid ("afed105b-59a6-42b3-b791-851680173db8")
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
    @objid ("9e520444-9832-45f8-8e15-a23def4eae81")
    public static SwAccessServiceCollaboration safeInstantiate(final Collaboration obj) throws IllegalArgumentException {
        if (SwAccessServiceCollaboration.canInstantiate(obj))
        	return new SwAccessServiceCollaboration(obj);
        else
        	throw new IllegalArgumentException("SwAccessServiceCollaboration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bf45b08c-ac42-4a3d-93f0-5af49dda0ba6")
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
    @objid ("b24ec015-9704-455e-9858-c14da42ff1bf")
    @Override
    public Collaboration getElement() {
        return (Collaboration)super.getElement();
    }

    /**
     * Getter for string property 'SwAccessService_Collaboration_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76e0abff-4bc5-4206-be60-9917b251ff8d")
    public String getSwAccessService_Collaboration_accessedElement() {
        return this.elt.getTagValue(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE_ELT);
    }

    @objid ("5bfba2be-5828-4e54-9a97-ac7532aabc2d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwAccessService_Collaboration_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f546bff8-8e51-4cdc-8be0-4c030776fcd6")
    public boolean isSwAccessService_Collaboration_isModifier() {
        return this.elt.isTagged(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SwAccessService_Collaboration_accessedElement'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a09428db-637e-4edf-ac08-ac18986c0601")
    public void setSwAccessService_Collaboration_accessedElement(final String value) {
        this.elt.putTagValue(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SwAccessService_Collaboration_isModifier'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eff0cc53-b1bb-4b59-8871-cdfcc6bedab1")
    public void setSwAccessService_Collaboration_isModifier(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwAccessServiceCollaboration.MdaTypes.SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT);
    }

    @objid ("cd77c928-a643-4fed-89bc-f4c50807c3eb")
    protected SwAccessServiceCollaboration(final Collaboration elt) {
        super(elt);
    }

    @objid ("1365e5df-6c1c-49f8-9741-cbe07f23be5d")
    public static final class MdaTypes {
        @objid ("458ac601-8927-4fed-beee-c826c9005d8b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2490e227-63bf-4434-b42e-d6c0b6725376")
        public static TagType SWACCESSSERVICE_COLLABORATION_ISMODIFIER_TAGTYPE_ELT;

        @objid ("691c65ed-c555-45aa-a2ab-5f2759f68c3e")
        public static TagType SWACCESSSERVICE_COLLABORATION_ACCESSEDELEMENT_TAGTYPE_ELT;

        @objid ("e91ddec7-8050-47c6-b307-0dfea269d18b")
        private static Stereotype MDAASSOCDEP;

        @objid ("2061eb56-de5e-4f6e-bb7c-9988db1f10e4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4d4f52e2-d38d-4655-b9de-7ec92625e213")
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
