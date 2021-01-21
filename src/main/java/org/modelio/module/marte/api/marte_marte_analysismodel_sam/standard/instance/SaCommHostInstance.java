/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance.GaCommHostInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SaCommHost_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("7b48ce17-e329-43e9-9549-cc827810744c")
public class SaCommHostInstance extends GaCommHostInstance {
    @objid ("39d13ae9-9810-4ce7-b0d8-37acb756e1ea")
    public static final String STEREOTYPE_NAME = "SaCommHost_Instance";

    @objid ("46f9fa3c-9ac5-4a88-99e1-566af9e3021f")
    public static final String SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE = "SaCommHost_Instance_isSched";

    @objid ("55bd2aee-45b0-41d7-8c5e-f1bf1c20b5e3")
    public static final String SACOMMHOST_INSTANCE_SCHSLACK_TAGTYPE = "SaCommHost_Instance_schSlack";

    /**
     * Tells whether a {@link SaCommHostInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SaCommHost_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bee7457e-fa7b-4d77-aeda-f9bad89b1b2d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SaCommHost_Instance >> then instantiate a {@link SaCommHostInstance} proxy.
     * 
     * @return a {@link SaCommHostInstance} proxy on the created {@link Instance}.
     */
    @objid ("17c81d52-add0-4cb6-ae76-6844256503e8")
    public static SaCommHostInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostInstance.STEREOTYPE_NAME);
        return SaCommHostInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostInstance} proxy from a {@link Instance} stereotyped << SaCommHost_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SaCommHostInstance} proxy or <i>null</i>.
     */
    @objid ("7753a01c-2ec4-4456-94e5-652fde78c9ec")
    public static SaCommHostInstance instantiate(final Instance obj) {
        return SaCommHostInstance.canInstantiate(obj) ? new SaCommHostInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostInstance} proxy from a {@link Instance} stereotyped << SaCommHost_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SaCommHostInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9d71eb90-4115-413f-ae84-5ef1540dbf43")
    public static SaCommHostInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SaCommHostInstance.canInstantiate(obj))
        	return new SaCommHostInstance(obj);
        else
        	throw new IllegalArgumentException("SaCommHostInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("719ad365-9155-4a1e-8d17-fad7cd236efa")
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
        SaCommHostInstance other = (SaCommHostInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("e5b4aacd-01ce-463c-9226-984537e58dfc")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'SaCommHost_Instance_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c71757d-645f-49e2-90b8-b0202258e190")
    public String getSaCommHost_Instance_schSlack() {
        return this.elt.getTagValue(SaCommHostInstance.MdaTypes.SACOMMHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT);
    }

    @objid ("16edba3a-ee51-4f3e-ad2e-9af9ec225d3b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Instance_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c549634-d942-48e3-bc8a-9668cb691b3e")
    public boolean isSaCommHost_Instance_isSched() {
        return this.elt.isTagged(SaCommHostInstance.MdaTypes.SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Instance_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("831cffed-f15b-43bd-b704-60cda98e172b")
    public void setSaCommHost_Instance_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostInstance.MdaTypes.SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostInstance.MdaTypes.SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_Instance_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb79cf25-7b6f-466e-8505-454044d0f8b0")
    public void setSaCommHost_Instance_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostInstance.MdaTypes.SACOMMHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT, value);
    }

    @objid ("f25daf1e-1434-46d6-a048-7eb6dcb1b3bc")
    protected SaCommHostInstance(final Instance elt) {
        super(elt);
    }

    @objid ("67794a5b-74da-495c-90d0-b2895116c56d")
    public static final class MdaTypes {
        @objid ("20b9a714-7e2a-46e5-85a2-c2d54619c9cf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("686080a0-41d9-4b07-be30-bf922b7f74e1")
        public static TagType SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE_ELT;

        @objid ("c09005b0-2397-4d3c-bdb0-149fbbf66645")
        public static TagType SACOMMHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT;

        @objid ("8b1c02e2-d71c-4fe4-9252-0ce30063c513")
        private static Stereotype MDAASSOCDEP;

        @objid ("1dcff0a7-f0df-4430-bcbc-945c92704407")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d4499f5e-6e74-4c9e-910c-1a0c7eb83b6c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "039c924a-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9251-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9258-0ccf-11df-8525-001302895b2b");
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
