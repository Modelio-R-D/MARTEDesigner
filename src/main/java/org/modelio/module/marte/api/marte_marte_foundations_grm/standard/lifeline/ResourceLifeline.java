/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << Resource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("d81b6091-c8ca-4c43-a707-b506dee546d0")
public class ResourceLifeline {
    @objid ("a7af50d3-3e79-4bdb-a256-42eb85dbeda8")
    public static final String STEREOTYPE_NAME = "Resource_Lifeline";

    @objid ("742d7d6f-8d91-4871-b786-2fb49bfab1f7")
    public static final String RESOURCE_LIFELINE_ISACTIVE_TAGTYPE = "Resource_Lifeline_isActive";

    @objid ("45ff4981-b299-4a22-aac4-dd7e223a75b7")
    public static final String RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE = "Resource_Lifeline_isProtected";

    @objid ("2d7b90e9-05b4-4c6a-9c12-54bfe9e6eb58")
    public static final String RESOURCE_LIFELINE_RESMULT_TAGTYPE = "Resource_Lifeline_resMult";

    /**
     * The underlying {@link Lifeline} represented by this proxy, never null.
     */
    @objid ("370317d9-cda5-4a55-84cc-421205019496")
    protected final Lifeline elt;

    /**
     * Tells whether a {@link ResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << Resource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("66ca0a0c-87d9-4d4f-8e2f-ff86678a177e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << Resource_Lifeline >> then instantiate a {@link ResourceLifeline} proxy.
     * 
     * @return a {@link ResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("b0a6af30-f0fa-422c-8a00-9119c25b81e0")
    public static ResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ResourceLifeline.STEREOTYPE_NAME);
        return ResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link ResourceLifeline} proxy from a {@link Lifeline} stereotyped << Resource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link ResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("2162085f-f559-431a-bfab-238577379bfd")
    public static ResourceLifeline instantiate(final Lifeline obj) {
        return ResourceLifeline.canInstantiate(obj) ? new ResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ResourceLifeline} proxy from a {@link Lifeline} stereotyped << Resource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link ResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dc85e4f1-7f06-48ad-9ef3-f799a8bd62fa")
    public static ResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (ResourceLifeline.canInstantiate(obj))
        	return new ResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("ResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("99749d3f-2f64-47b4-8076-9bc9dd88e5e4")
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
        ResourceLifeline other = (ResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("20b174a0-88af-4b6c-b095-9c4759c3713f")
    public Lifeline getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'Resource_Lifeline_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("946bed40-2143-4bff-800f-99a0501d265e")
    public String getResource_Lifeline_resMult() {
        return this.elt.getTagValue(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_RESMULT_TAGTYPE_ELT);
    }

    @objid ("79dca257-2d05-47f0-b567-bd2fbd8e7349")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'Resource_Lifeline_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("06287f4e-34e0-4ef8-bda7-215c7d187941")
    public boolean isResource_Lifeline_isActive() {
        return this.elt.isTagged(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'Resource_Lifeline_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f03b4576-694b-41e6-8d58-8570e059aaf7")
    public boolean isResource_Lifeline_isProtected() {
        return this.elt.isTagged(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Lifeline_isActive'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("421adb6f-54a8-4fd8-a244-e164bf521df9")
    public void setResource_Lifeline_isActive(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'Resource_Lifeline_isProtected'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e7b89411-7e92-434e-9bf4-763171bf359c")
    public void setResource_Lifeline_isProtected(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'Resource_Lifeline_resMult'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("428f549d-959a-497d-b90f-d2b2da245e8b")
    public void setResource_Lifeline_resMult(final String value) {
        this.elt.putTagValue(ResourceLifeline.MdaTypes.RESOURCE_LIFELINE_RESMULT_TAGTYPE_ELT, value);
    }

    @objid ("e950279c-23a5-4583-a42c-cdbabcab5d34")
    protected ResourceLifeline(final Lifeline elt) {
        this.elt = elt;
    }

    @objid ("a99ac833-899b-4303-93b0-c3872cd182bd")
    public static final class MdaTypes {
        @objid ("2577acf9-2560-4f5a-9a61-d5e839c9d5b2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b08699a0-a9fc-4622-8b79-1262a813b6f6")
        public static TagType RESOURCE_LIFELINE_RESMULT_TAGTYPE_ELT;

        @objid ("4d2dcabd-b607-4045-9f6d-7634ac4a19b2")
        public static TagType RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT;

        @objid ("68c670ab-e96f-4554-a2fd-7eb800cf5139")
        public static TagType RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT;

        @objid ("f74b6357-77e5-4220-b989-2ae58dbb485d")
        private static Stereotype MDAASSOCDEP;

        @objid ("3c738963-faba-4827-924c-c68f9782c89d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("53796eca-c56c-425c-9955-b0445dbc288e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "76f4d21a-101a-11df-86fe-0014222a9f79");
            RESOURCE_LIFELINE_RESMULT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8a51a35d-101a-11df-86fe-0014222a9f79");
            RESOURCE_LIFELINE_ISPROTECTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8a51a35e-101a-11df-86fe-0014222a9f79");
            RESOURCE_LIFELINE_ISACTIVE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8a51a35f-101a-11df-86fe-0014222a9f79");
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
