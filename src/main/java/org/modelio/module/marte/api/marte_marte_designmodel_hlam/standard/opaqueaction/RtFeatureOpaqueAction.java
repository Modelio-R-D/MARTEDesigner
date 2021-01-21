/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.opaqueaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link OpaqueAction} with << RtFeature_OpaqueAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4069ac57-f8a7-46dc-937f-361c663cbf36")
public class RtFeatureOpaqueAction {
    @objid ("eedfa432-b192-417e-ab94-f11c0b117c97")
    public static final String STEREOTYPE_NAME = "RtFeature_OpaqueAction";

    @objid ("ba9b7d0d-f995-4780-9940-90063abd9ed3")
    public static final String RTFEATURE_OPAQUEACTION_SPECIFICATION_NOTETYPE = "RtFeature_OpaqueAction_specification";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    @objid ("a6c1e506-0035-4aaa-aa4c-0795eb6a4a1b")
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link RtFeatureOpaqueAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << RtFeature_OpaqueAction >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c87912af-9a87-49f5-b084-837bafc3e07d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureOpaqueAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << RtFeature_OpaqueAction >> then instantiate a {@link RtFeatureOpaqueAction} proxy.
     * 
     * @return a {@link RtFeatureOpaqueAction} proxy on the created {@link OpaqueAction}.
     */
    @objid ("754d5a84-29bd-4fe5-aa81-5164a96cb6ca")
    public static RtFeatureOpaqueAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("OpaqueAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureOpaqueAction.STEREOTYPE_NAME);
        return RtFeatureOpaqueAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link RtFeatureOpaqueAction} proxy from a {@link OpaqueAction} stereotyped << RtFeature_OpaqueAction >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link RtFeatureOpaqueAction} proxy or <i>null</i>.
     */
    @objid ("c247baef-2cf6-4c9c-9306-6346dd5186f0")
    public static RtFeatureOpaqueAction instantiate(final OpaqueAction obj) {
        return RtFeatureOpaqueAction.canInstantiate(obj) ? new RtFeatureOpaqueAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtFeatureOpaqueAction} proxy from a {@link OpaqueAction} stereotyped << RtFeature_OpaqueAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link RtFeatureOpaqueAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d5703833-c25a-481d-8273-5cb68041c193")
    public static RtFeatureOpaqueAction safeInstantiate(final OpaqueAction obj) throws IllegalArgumentException {
        if (RtFeatureOpaqueAction.canInstantiate(obj))
        	return new RtFeatureOpaqueAction(obj);
        else
        	throw new IllegalArgumentException("RtFeatureOpaqueAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f9ad72cc-b02f-4be0-84dc-d9452c162db0")
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
        RtFeatureOpaqueAction other = (RtFeatureOpaqueAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    @objid ("9d6ac5f0-e417-4eef-89ee-d37d42884a37")
    public OpaqueAction getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_OpaqueAction_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("061cbed9-cbd7-4174-9167-aea653a9a02d")
    public String getRtFeature_OpaqueAction_specificationNote() {
        return this.elt.getNoteContent(RtFeatureOpaqueAction.MdaTypes.RTFEATURE_OPAQUEACTION_SPECIFICATION_NOTETYPE_ELT);
    }

    @objid ("b3cf85d3-59f5-471a-ad4a-2c31a1ed83f6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_OpaqueAction_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("ebd795b0-a5fb-4fac-8932-fb6e482ca5a6")
    public void setRtFeature_OpaqueAction_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureOpaqueAction.MdaTypes.RTFEATURE_OPAQUEACTION_SPECIFICATION_NOTETYPE_ELT, value);
    }

    @objid ("b89d3839-cefb-419a-8743-34106d2a2b69")
    protected RtFeatureOpaqueAction(final OpaqueAction elt) {
        this.elt = elt;
    }

    @objid ("34e36865-4de9-470c-b355-317242b9863e")
    public static final class MdaTypes {
        @objid ("21eb585c-46f9-4033-a413-4fb3a7c8c23d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f1ec3394-c863-4e38-8b53-ac09ebd16671")
        public static NoteType RTFEATURE_OPAQUEACTION_SPECIFICATION_NOTETYPE_ELT;

        @objid ("e61d0aaf-3330-4cca-8407-c2c9b9c7b650")
        private static Stereotype MDAASSOCDEP;

        @objid ("b843b2bf-2a76-436a-88a5-a0a99b642313")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d8a4cc87-3a11-44df-b929-5de8be4dc4a3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "316c89a0-14b3-11df-ad67-001302895b2b");
            RTFEATURE_OPAQUEACTION_SPECIFICATION_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "17e5f623-9276-11e0-aeeb-0027103f347c");
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
