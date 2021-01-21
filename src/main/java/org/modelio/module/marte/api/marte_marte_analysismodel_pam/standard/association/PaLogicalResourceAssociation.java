/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_pam.standard.association;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << PaLogicalResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5f6ab527-689e-429f-a0a3-3173cfe877e6")
public class PaLogicalResourceAssociation extends ResourceAssociation {
    @objid ("4f4a3565-a1c9-4dd8-a574-df17ce310b79")
    public static final String STEREOTYPE_NAME = "PaLogicalResource_Association";

    @objid ("0ef368c8-4d02-4546-af18-3d575d59da8f")
    public static final String PALOGICALRESOURCE_ASSOCIATION_POOLSIZE_TAGTYPE = "PaLogicalResource_Association_poolSize";

    @objid ("a80cfce2-6387-47be-ac4f-a84bbeb345f7")
    public static final String PALOGICALRESOURCE_ASSOCIATION_THROUGHPUT_TAGTYPE = "PaLogicalResource_Association_throughput";

    @objid ("708e29d6-e34b-48c3-ba29-7af3d81d2ae5")
    public static final String PALOGICALRESOURCE_ASSOCIATION_UTILIZATION_TAGTYPE = "PaLogicalResource_Association_utilization";

    /**
     * Tells whether a {@link PaLogicalResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << PaLogicalResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9df2c8a6-6251-42d2-9a1c-41ce29c67518")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << PaLogicalResource_Association >> then instantiate a {@link PaLogicalResourceAssociation} proxy.
     * 
     * @return a {@link PaLogicalResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("5c26ae28-694e-48df-924d-54f6b90748ef")
    public static PaLogicalResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, PaLogicalResourceAssociation.STEREOTYPE_NAME);
        return PaLogicalResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceAssociation} proxy from a {@link Association} stereotyped << PaLogicalResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link PaLogicalResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("81732fa9-e118-4710-b024-79b86da30a69")
    public static PaLogicalResourceAssociation instantiate(final Association obj) {
        return PaLogicalResourceAssociation.canInstantiate(obj) ? new PaLogicalResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaLogicalResourceAssociation} proxy from a {@link Association} stereotyped << PaLogicalResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link PaLogicalResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4bf97550-e899-4b02-ba89-a0b7c7b6d9fc")
    public static PaLogicalResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (PaLogicalResourceAssociation.canInstantiate(obj))
        	return new PaLogicalResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("PaLogicalResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d31bae35-1c0e-4f9d-8e2b-023b35204683")
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
        PaLogicalResourceAssociation other = (PaLogicalResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("6416063e-0b7b-4601-be9a-9ae59e524768")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'PaLogicalResource_Association_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f77475e2-b151-497d-9d58-ff339fd050a6")
    public String getPaLogicalResource_Association_poolSize() {
        return this.elt.getTagValue(PaLogicalResourceAssociation.MdaTypes.PALOGICALRESOURCE_ASSOCIATION_POOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Association_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3fdf6b13-2f17-41e0-8f15-88c274fc3c9d")
    public String getPaLogicalResource_Association_throughput() {
        return this.elt.getTagValue(PaLogicalResourceAssociation.MdaTypes.PALOGICALRESOURCE_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'PaLogicalResource_Association_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0331bb4a-5012-44fe-9dd6-dd18f799abf3")
    public String getPaLogicalResource_Association_utilization() {
        return this.elt.getTagValue(PaLogicalResourceAssociation.MdaTypes.PALOGICALRESOURCE_ASSOCIATION_UTILIZATION_TAGTYPE_ELT);
    }

    @objid ("124c12ce-0d97-46c6-a385-48488b87a2bb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'PaLogicalResource_Association_poolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("574bc3ef-9a53-40e4-8bb4-de069bc5514a")
    public void setPaLogicalResource_Association_poolSize(final String value) {
        this.elt.putTagValue(PaLogicalResourceAssociation.MdaTypes.PALOGICALRESOURCE_ASSOCIATION_POOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Association_throughput'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("839eff05-755a-4d6f-aff4-2c4f50cba8ed")
    public void setPaLogicalResource_Association_throughput(final String value) {
        this.elt.putTagValue(PaLogicalResourceAssociation.MdaTypes.PALOGICALRESOURCE_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'PaLogicalResource_Association_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("65a87cbf-1e30-46f2-9cf6-93166dc94cf2")
    public void setPaLogicalResource_Association_utilization(final String value) {
        this.elt.putTagValue(PaLogicalResourceAssociation.MdaTypes.PALOGICALRESOURCE_ASSOCIATION_UTILIZATION_TAGTYPE_ELT, value);
    }

    @objid ("5f821339-2d50-47e4-8ba5-01a46438a1ef")
    protected PaLogicalResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("24f4ec75-1ce4-46c6-a0a4-f028a713d52e")
    public static final class MdaTypes {
        @objid ("04c9b842-2e3d-4af6-a6a5-1cfbe7b9ef79")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fbc3f650-8e34-43a3-afeb-6b59c4f2a08b")
        public static TagType PALOGICALRESOURCE_ASSOCIATION_UTILIZATION_TAGTYPE_ELT;

        @objid ("38139ccf-96ed-47af-bc1c-32f0fb12a028")
        public static TagType PALOGICALRESOURCE_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT;

        @objid ("4579dd48-1059-4958-98cc-c25bc7d7d4df")
        public static TagType PALOGICALRESOURCE_ASSOCIATION_POOLSIZE_TAGTYPE_ELT;

        @objid ("a9ac6445-dbc3-48c1-9acf-e0613cdfd54c")
        private static Stereotype MDAASSOCDEP;

        @objid ("9c29be2c-bdf7-426c-94e1-08595b81720a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7b9a115e-a897-48c0-95ee-e553fae2db65")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "30d31fb9-14b2-11df-9d54-0014222a9f79");
            PALOGICALRESOURCE_ASSOCIATION_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "30d31fba-14b2-11df-9d54-0014222a9f79");
            PALOGICALRESOURCE_ASSOCIATION_THROUGHPUT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "30d31fbc-14b2-11df-9d54-0014222a9f79");
            PALOGICALRESOURCE_ASSOCIATION_POOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "30d31fbb-14b2-11df-9d54-0014222a9f79");
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
